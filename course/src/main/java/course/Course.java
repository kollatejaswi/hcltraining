package course;

import java.util.List;

public class Course {
	List<CourseList> course;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(List<CourseList> course) {
		super();
		this.course = course;
	}
	public List<CourseList> getCourse() {
		return course;
	}
	public void setCourse(List<CourseList> course) {
		this.course = course;
	}
	    }
