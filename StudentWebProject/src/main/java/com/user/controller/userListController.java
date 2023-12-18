package com.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDAO;
import com.userlist.vo.UserListVO1;
@WebServlet("/user/list")
public class userListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//2. 검색 결과를 뿌린다.
		String q_ = req.getParameter("q");
		String f_ = req.getParameter("f");
		
		String f = "usernm";
		String q = "";
		String sql_ = "";
		
		if(f_!=null && f_!="") 
			f = f_;
		
		if(q_!=null && q_!="") 
			q = q_;
		
		if(f.equals("userrole")) {
			sql_ = " and ce.CODENM like ? ";
		}else if (f.equals("dept")) {
			sql_ = " and cd.DEPTNM like ? ";
		}else {
			sql_ = " and cu.userNm like ? ";
		}
		
		//1. 리스트 를 뿌린다.
		UserDAO ud = new UserDAO();
		List<UserListVO1>list = ud.getUserList(sql_, q);
		req.setAttribute("ul", list);
		req.getRequestDispatcher("/WEB-INF/jsp/user/userList.jsp").forward(req, resp);
	}
}
