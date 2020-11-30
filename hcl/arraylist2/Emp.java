package com.hcl.arraylist2;

import java.util.*;

public class Emp  {
	String hallId;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
public Emp(String hallId) {
		super();
		this.hallId = hallId;
	}

public String getHallId() {
	return hallId;
}

public void setHallId(String hallId) {
	this.hallId = hallId;
}

List<Emp> e= new ArrayList<>();
public Emp getHall(String eno)
{
	Emp emp=null;
	int i=0;
	for(Emp e1:e)
	{
		if(e1.getHallId().equals(eno))
		{
			i=1;
			emp=e1;
			System.out.println(e1);
		}
	}
	return emp;
}

}
