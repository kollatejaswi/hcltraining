package course;

import java.util.Comparator;

public class Sort implements Comparator<CourseList> {

	@Override
	public int compare(CourseList o1, CourseList o2) {
		// TODO Auto-generated method stub
		return o1.getFee().compareTo(o2.getFee());
	}

}
