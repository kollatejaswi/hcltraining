package course;

import java.util.*;

public class Elearn  {
	private Course c;
	public Elearn() {
		// TODO Auto-generated constructor stub
	}
	public Elearn(Course c) {
		super();
		this.c = c;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public void display()
	{
		double total=0,i;
		List<CourseList> course=c.getCourse();
		CourseList max=Collections.max(course,new Sort());
		int c1=(int)((0.2)*max.getFee());
		System.out.println(c1+"discount for"+max.getName());
		CourseList min=Collections.min(course,new Sort());
		int c2=(int)((0.05)*min.getFee());
		System.out.println(c2+"discount for"+min.getName());
	
	}
     
}
