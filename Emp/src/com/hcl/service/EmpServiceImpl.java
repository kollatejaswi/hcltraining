package com.hcl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hcl.dao.EmpDaoImpl;
import com.hcl.dao.EmpDao;
import com.hcl.domain.Emp;

public class EmpServiceImpl implements EmpService {
	
    private EmpDao empdao;
    public EmpServiceImpl() {
		// TODO Auto-generated constructor stub
	}
    
	public EmpServiceImpl(EmpDao empdao) {
		super();
		this.empdao = empdao;
	}

	@Override
	public void add() {
		EmpDaoImpl ed= new EmpDaoImpl ();
		Scanner s=new Scanner(System.in);
		List<Emp> em=new ArrayList<Emp>();
		Emp e =new Emp();
		int eno;
		String name;
		System.out.println("enter the employee details");
		eno=s.nextInt();
		s.nextLine();
		name=s.nextLine();
		e.setEno(eno);
		e.setName(name);
		em.add(e);
		ed.insert(e);

	}

	@Override
	public void delete() {
		EmpDaoImpl ed= new EmpDaoImpl ();
		Scanner s=new Scanner(System.in);
		List<Emp> em=new ArrayList<Emp>();
		Emp e =new Emp();
		int eno;
		System.out.println("enter the employee details");
		eno=s.nextInt();
		s.nextLine();
		ed.delete(eno);
		
	}

	@Override
	public List<Emp> getDetails() {
		// TODO Auto-generated method stub
		return empdao.getDetails();
	}

	@Override
	public void update() {
		EmpDaoImpl ed= new EmpDaoImpl ();
		Scanner s=new Scanner(System.in);
		List<Emp> em=new ArrayList<Emp>();
		Emp e =new Emp();
		int eno;
		String name;
		System.out.println("enter the employee details");
		eno=s.nextInt();
		s.nextLine();
		name=s.nextLine();
		ed.update(eno,name);
		
	}

}
