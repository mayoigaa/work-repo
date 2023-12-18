package com.pubmed;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pubmed/list")
public class PubmedListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String f_ = req.getParameter("f");// 필드
		String q_ = req.getParameter("q");// 검색어 파라미터

		String f = "jnm"; // 필드 기본값
		String q = ""; // 검색어 기본값
		String g = "";

		if (f_ != null && !f_.equals("")) { // 필드 값이 있을경우
			f = f_; // 변수 p 에 검색어 추가
		}

		if (q_ != null && !q_.equals("")) { // 검색어가 있을경우
			q = q_; // 변수 q 에 검색어 추가
		}

		System.out.println("f : " + f);

		if (f.equals("jnm")) {
			g = " where journal_nm like ? ";
		} else if (f.equals("isn")) {
			g = " where issn like ? ";
		} else {
		}

		
		PubmedDAO pd = new PubmedDAO();	
		List<PubmedVO>list = pd.getPubmedList(g,q);
		req.setAttribute("pl", list);
		req.getRequestDispatcher("/WEB-INF/jsp/pubmed/pubmedList.jsp").forward(req, resp);
		
		
	}
}
