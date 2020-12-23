package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
 @Bean
 public Emp getEmp()
 {
	 Emp e=new Emp();
	 e.setEno(1);
	 e.setName("tejaswi");
	 e.setAddress("rajam");
	 
	 return e;
 }

}
