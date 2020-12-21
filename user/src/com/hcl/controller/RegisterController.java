package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.domain.User;
import com.hcl.service.UserService;
import com.hcl.service.UserServiceImpl;


@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService service=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg="";
		PrintWriter pw=response.getWriter();
		int userid=Integer.parseInt(request.getParameter("uid"));
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		String gender=request.getParameter("gender");
		String designation=request.getParameter("des");
		User user=new User(userid,username,password,gender,designation);
		boolean b=service.register(user);
		if(b)
		{
			msg="Successfully registered";
		}
		else
		{
			msg="Not Registered";
			request.setAttribute("message", msg);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
