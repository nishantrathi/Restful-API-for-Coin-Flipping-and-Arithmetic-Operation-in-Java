package edu.fullerton.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.fullerton.service.Flip;

/**
 * Servlet implementation class FlipCoinServlet
 */
public class FlipCoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FlipCoinServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Flip flipObj = new Flip();
		int val =  Integer.valueOf(request.getParameter("coinValue"));
		String coinFlip = flipObj.flipCoin(val).toString();
		response.setContentType("application/text");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(coinFlip);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Flip flipObj = new Flip();
		int val =  Integer.valueOf(request.getParameter("coinValue"));
		String coinFlip = flipObj.flipCoin(val).toString();
		response.setContentType("application/text");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(coinFlip);
	}

}
