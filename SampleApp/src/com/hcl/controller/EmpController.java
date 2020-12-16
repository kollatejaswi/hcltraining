package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.hcl.domain.Emp;
import com.hcl.service.EmpService;
import com.hcl.service.EmpServiceImpl;

public class EmpController extends GenericServlet {
	private static final long serialVersionUID = 1L;
       EmpService service=new EmpServiceImpl();
    public EmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		List <Emp> emp = service.getDetails();
		pw.println("<table>");
		for(Emp e:emp){
			pw.println("<tr>");
			pw.println("<td>"+e.getEno()+"</td><td>"+e.getName()+"</td>");
			pw.println("</tr>");	
		}
		pw.println("</table>");
		pw.close();
	}

}
