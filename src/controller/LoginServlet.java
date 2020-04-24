package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		UserDAO user=new UserDAOImpl();
		User pers=user.query(username, password);
		String destPage="login.jsp";
		if (pers!=null) {
			HttpSession session= req.getSession();
			session.setAttribute("pers",pers);
			destPage="index.jsp";
		}
		else {
			String message="Invalid email/password";
			req.setAttribute("message", message);
		}
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher(destPage);
		dispatcher.forward(req, resp);
	}
	
}
