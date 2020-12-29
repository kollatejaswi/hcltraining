package com.hcl.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.domain.Emp;
import com.hcl.service.EmpService;

@Controller
public class HelloController {
	private EmpService service;
@Autowired
 public HelloController(EmpService service) {
		super();
		this.service = service;
	}
@RequestMapping(value={"/","/index"}, method = RequestMethod.GET)
 public String getHome()
 {
	 return "index";
 }
 @RequestMapping(value={"/new"}, method = RequestMethod.GET)
 public String getForm()
 {
	 return "empform";
 }
 @RequestMapping(value={"/process"}, method = RequestMethod.POST)
 public String getInsert(HttpServletRequest request)
 {
	 int eno=Integer.parseInt(request.getParameter("eno"));
	 String name=request.getParameter("name");
	 Emp e=new Emp(eno,name);
	 boolean b=service.insert(e);
	 String url=null;
	 if(b)
	 {
	     url="redirect:/";
	 }
	 return url;
 }
 @RequestMapping(value={"/display"}, method = RequestMethod.GET)
 public String getDisplay(Model model)
 {
	 List <Emp> emp=service.getAll();
	 model.addAttribute("emp",emp);
	 return "display";
 }
}
