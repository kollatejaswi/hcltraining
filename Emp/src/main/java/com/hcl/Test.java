package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("spring-bean.xml");
	      Emp e=content.getBean(Emp.class);
	      System.out.println(e.getEno()+"\t"+e.getName());
          Address a=e.getAddress();
          System.out.println(a.getHno()+"\t"+a.getStreetname()+"\t"+a.getLandmark());

	}

}
