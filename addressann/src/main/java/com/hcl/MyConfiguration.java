package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
 @Bean
 public Address getAddress()
 {
	 Address a=new Address();
	 a.setHno(101);
	 a.setStreetname("gandhi nagar");
	 a.setLandmark("near temple");
	 return a;
 }
 @Bean
 public Emp getEmp()
 {
	 Emp e=new Emp();
	 e.setEno(1);
	 e.setName("tejaswi");
	 e.setAddress(getAddress());
	 
	 return e;
 }

}
