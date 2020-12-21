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
import javax.servlet.http.HttpSession;

import com.hcl.domain.Product;
import com.hcl.service.ProductService;
import com.hcl.service.ProductServiceImpl;


@WebServlet("/products")
public class Productcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProductService service=new ProductServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		List <Product> emp = service.getProduct();
		HttpSession session=request.getSession();
		session.setAttribute("product", emp);
		RequestDispatcher dr=request.getRequestDispatcher("products.jsp");
		dr.forward(request,response);

	}

}
