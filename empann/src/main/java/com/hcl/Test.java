package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Emp e=context.getBean(Emp.class);
		System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());

	}

}
