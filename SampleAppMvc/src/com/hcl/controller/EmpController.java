package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.domain.Emp;
import com.hcl.service.EmpService;
import com.hcl.service.EmpServiceImpl;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpService service=new EmpServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		List <Emp> emp = service.getDetails();
		request.setAttribute("employee", emp);
		RequestDispatcher dr=request.getRequestDispatcher("display.jsp");
		dr.forward(request,response);
	}

}
