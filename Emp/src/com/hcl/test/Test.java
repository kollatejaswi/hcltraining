package com.hcl.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hcl.dao.EmpDao;
import com.hcl.dao.EmpDaoImpl;
import com.hcl.domain.Emp;
import com.hcl.service.EmpService;
import com.hcl.service.EmpServiceImpl;

public class Test {
	public static void main(String[] args) {
		EmpDao d=new EmpDaoImpl();
		EmpService se1=new EmpServiceImpl(d);
		EmpService se=new EmpServiceImpl(d);
		List<Emp> em=se.getDetails();
		System.out.println("1.insert");
		System.out.println("2.delete");
		System.out.println("3.display");
		System.out.println("4.update");
		System.out.println("enter your choice");
		int i;
		Scanner s= new Scanner(System.in);
		i=s.nextInt();
		switch(i)
		{
		     case 1:
			   se1.add();
			   break;
		     case 2:
		    	 se1.delete();
		    	 break;
		     case 3:
		    	 em.stream().forEach(emp->{
		 			System.out.println(emp.getEno()+"\t"+emp.getName());
		 		}); 
		    	 break;
		     case 4:
		    	 se1.update();
		    	 break;
		
		}
		
	}
}
