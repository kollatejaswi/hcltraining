package com.hcl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
 @Bean
 public Collage getCollage()
 {
	Collage c=new Collage();
	c.setName("tex academy");
	Set<String> course=new HashSet<>();
	   course.add("java");
	   course.add(".net");
	   course.add("pega");
	   c.setCourses(course);
	 return c;
 }

}
