package com.pubmed;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pubmed/detail")
public class PubmedDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String param = req.getParameter("id");
		
		int id =0;
		
		if(param != null && param !="") {
			id = Integer.parseInt(param);
		}
		
		PubmedDAO pd = new PubmedDAO();
		PubmedVO pv = pd.getPubmedDetail(id);
		
		req.setAttribute("id", param);
		req.setAttribute("pd", pv);
		req.getRequestDispatcher("/WEB-INF/jsp/pubmed/detail.jsp").forward(req, resp);
	}
}
