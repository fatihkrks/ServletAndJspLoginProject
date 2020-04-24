package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDAO;
import dao.AdminDAOImpl;

@WebServlet("/adminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	String name=req.getParameter("name");
	String surname=req.getParameter("surname");
	int sicilno= Integer.parseInt(req.getParameter("sicilno"));
	String password=req.getParameter("password");
	String passwordagain=req.getParameter("passwordagain");
	String department=req.getParameter("department");
	String departmentManager=req.getParameter("departmentManager");
	String role=req.getParameter("role");
	String informationService=req.getParameter("informationService");
	String travelservice=req.getParameter("travelservice");
	
	AdminDAO admin= new AdminDAOImpl();
	admin.register(name, surname, sicilno, password, passwordagain, department, departmentManager, role, informationService, travelservice);
	RequestDispatcher dispatcher=req.getRequestDispatcher("adminlogin.jsp");
	dispatcher.forward(req, resp);
}
}
