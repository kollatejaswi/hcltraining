package sampleapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {
      ApplicationContext content = new ClassPathXmlApplicationContext("spring-bean.xml");
      Emp e=content.getBean(Emp.class);
      System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());

	}

}
