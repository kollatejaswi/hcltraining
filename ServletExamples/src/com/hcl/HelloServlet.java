package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class HelloServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Hello</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
