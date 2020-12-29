package com.hcl.domain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.service.EmpService;
import com.hcl.service.EmpServiceImpl;
import com.hcl.service.RoomService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("spring-beam.xml");
		RoomService e=content.getBean(RoomService.class);
         List<Room> emp=e.getAll();
         emp.stream().forEach(em->{
        	 System.out.println(em.getRoomtype());
         });
         }

}
