package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.domain.User;
import com.hcl.service.UserService;
import com.hcl.service.UserServiceImpl;

@WebServlet("/login")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		User user=new User(username,password);
		HttpSession session=null;
		boolean b=service.validate(user);
		if(b)
		{
			session=request.getSession();
			Optional<User> user1=service.getUserByUserName(username);
			session.setAttribute("user",user1.get());
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
		}
		else
		{
		   response.sendRedirect("index.jsp");
		}
	}

}
