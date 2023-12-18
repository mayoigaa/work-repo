package com.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.dao.BoardDAO;
import com.board.vo.BoardListVO;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String dept = req.getSession().getAttribute("dept").toString();
			String userNm = req.getSession().getAttribute("userNm").toString();
			
			
			String f_ = req.getParameter("f");// 필드
			String q_ = req.getParameter("q");// 검색어 파라미터
			String p_ = req.getParameter("p");// 페이지 파라미터

			String f = "title"; // 필드 기본값
			String q = ""; // 검색어 기본값
			int p = 1; //페이지 기본값
			
			String g = "";

			if (f_ != null && !f_.equals("")) { // 필드 값이 있을경우
				f = f_; // 변수 p 에 검색어 추가
			}

			if (q_ != null && !q_.equals("")) { // 검색어가 있을경우
				q = q_; // 변수 q 에 검색어 추가
			}
			
			if (p_ != null && !p_.equals("")) { // 페이지 있을경우
				p = Integer.parseInt(p_); // 변수 p 에 숫자로 형변환
			}

			System.out.println("f : " + f);

			if (f.equals("title")) {
				g = "and tb.brdtitle like ? ";
			} else if (f.equals("user")) {
				g = "and cu.usernm like ? ";
			} else {
			}
			
			
			int count = BoardDAO.getInstance().getBoardListCount(g,q); // 게시글 갯수 구하기
			
			List<BoardListVO> list = BoardDAO.getInstance().getBoardList(p,g, q);// 게시글 목록
			
			req.setAttribute("cnt", count); // 게시판 글 갯수를 jsp 전달
			req.setAttribute("userNm", userNm);  // 사용자 명을 jsp에 전달
			req.setAttribute("dept", dept);		 // 부서정보  jsp에 전달
			req.setAttribute("bl", list);		// 게시판글 목록 전달

			req.getRequestDispatcher("/WEB-INF/jsp/board/board.jsp").forward(req, resp);
			//}else {
			//resp.sendRedirect("/");
	
	}
}
