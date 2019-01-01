package task3_method1;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {

	@Override
	public int compare(Student s0, Student s1) {
		return s0.getCourse() - s1.getCourse();
	}

}
