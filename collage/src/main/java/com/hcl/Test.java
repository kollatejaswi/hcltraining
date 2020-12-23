package com.hcl;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Collage e=context.getBean(Collage.class);
		System.out.println(e.getName());
		Set<String> c=e.getCourses();
		for(String co:c)
		{
			System.out.println(co);
		}

	}

}
