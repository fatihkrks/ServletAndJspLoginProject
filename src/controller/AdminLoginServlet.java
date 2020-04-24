package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDAO;
import dao.AdminDAOImpl;
import model.Admin;
@WebServlet("/adminLoginServlet")
public class AdminLoginServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
					int sicilno= Integer.parseInt(req.getParameter("sicilno")) ;
					String password=req.getParameter("password");
					AdminDAO admin=new AdminDAOImpl();
					Admin adminobj= admin.query(sicilno, password);
					String destPage="adminlogin.jsp";
					if (adminobj!=null) {
						HttpSession session= req.getSession();
						session.setAttribute("adminobj", adminobj);
						destPage="Adminindex.jsp";
					}
					else {
						
						String message="Invalid email/password";
						req.setAttribute("message", message);
					}
					RequestDispatcher dispatcher=req.getRequestDispatcher(destPage);
					dispatcher.forward(req, resp);
	}
}
