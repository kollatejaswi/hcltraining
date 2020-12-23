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
	public double display()
	{
		double total=0,i;
		List<CourseList> course=c.getCourse();
		for(CourseList cou:course)
		{
			i=cou.getFee()*40;
			total=total+i;
		}
		return total;
	}
     
}
