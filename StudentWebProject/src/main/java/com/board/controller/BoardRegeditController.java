package com.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.vo.BoardRegeditVO;

@WebServlet("/board/regedit")
public class BoardRegeditController extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/board/regedit.jsp").forward(req, resp);
	}

	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//세션값
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			
			String userId = req.getSession().getAttribute("userID").toString();
			String userNm = req.getSession().getAttribute("userNm").toString();
			String dept = req.getSession().getAttribute("dept").toString();
			//파라미터 값
			String brdTitle = req.getParameter("brdtitle");
			String brdMemo = req.getParameter("brdmemo");
			
			System.out.println("val : " + userId +","+ userNm+","+dept +","+brdTitle);
			
			BoardRegeditVO bv = new BoardRegeditVO(brdTitle, userNm, brdMemo, dept, userId);
//			bv.setUser(userId);
//			bv.setUserNm(userNm);
//			bv.setDept(dept);
//			bv.setTitle(brdTitle);
//			bv.setMemo(brdMemo);
			int result = BoardDAO.getInstance().regeditBoard(bv);
			
			if(result >= 1) {
				resp.sendRedirect("/board/list");
			}else {
				doGet(req,resp);
			}
			
			
			
			
			
			
			
		}
}
