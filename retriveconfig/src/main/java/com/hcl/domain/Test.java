package com.hcl.domain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.service.EmpService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		EmpService e=context.getBean(EmpService.class);
		 List<Emp> emp=e.getAll();
         emp.stream().forEach(em->{
        	 System.out.println(em.getEno()+"\t"+em.getName());
         });
         }
	}

