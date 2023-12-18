package com.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.vo.BoardListVO;

@WebServlet("/board/detail")
public class BoardDetailController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String param =req.getParameter("brdno");
	
	int brdno = 0;
	
	if(param!=null && param !="") {
		brdno =Integer.parseInt(param);
	}
	
	BoardDAO bd = new BoardDAO();
	BoardListVO bv = bd.getBoardDetail(brdno);
	
	req.setAttribute("brdno",param);
	req.setAttribute("bd", bv);
	
	req.getRequestDispatcher("/WEB-INF/jsp/board/detail.jsp").forward(req, resp);
}
}
