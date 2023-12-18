package com.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.dao.UserDAO;
import com.user.vo.LoginVO;
import com.userlist.vo.UserListVO1;

@WebServlet("/user/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/user/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pid = req.getParameter("id");
		String ppass = req.getParameter("pass");
		
		LoginVO lv = new LoginVO(pid,ppass);
		
		UserDAO ud = new UserDAO();
		
		int result = ud.loginCheck(lv);
		
		
		if(result ==1) {
			System.out.println("로그인에 성공하였습니다");
			
			UserListVO1 uv = ud.getUserInfo(lv);
			HttpSession session = req.getSession();
			
			session.setAttribute("userID", uv.getUserId());
			session.setAttribute("userNm", uv.getUserNm());
			session.setAttribute("role", uv.getUserRole());
			session.setAttribute("dept", uv.getDept());
			
			System.out.println("dept :" +req.getSession().getAttribute("dept").toString());
			System.out.println("세션 값 확인1: " + req.getSession().getAttribute("userID").toString());
			System.out.println("세션 값 확인2: " + req.getSession().getAttribute("userNm").toString());
			resp.sendRedirect("/board/list");
		}else if(result == 0) {
			System.out.println("ID 와 PASSWORD 를 확인하여 주세요");
			doGet(req,resp);
		}else {
			System.out.println("로그인에 실패하였습니다.");
			doGet(req,resp);
		}
		
	}
}

