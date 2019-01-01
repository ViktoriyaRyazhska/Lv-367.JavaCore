package task3_method2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class Student {

	static NameComparator nameComparator = new NameComparator();
	static CourseComparator courseComparator = new CourseComparator();
	private String name;
	private int course;
	
	public Student () {
		
	}
	
	public Student (String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public static void printStudents (Set<Student> set, Integer course) {
		Iterator<Student> iteratorTest = set.iterator();
		
		while (iteratorTest.hasNext()) {
			
			Student temp = new Student();
			temp = iteratorTest.next();
			
			if (temp.getCourse() == course) {
				System.out.println(temp);
			}
		}
		
	}
	
	static public class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student s0, Student s1) {
			return s0.getName().compareTo(s1.getName());
		}
		
	}
	
	static public class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student s0, Student s1) {
			return s0.getCourse() - s1.getCourse();
		}

	}
	
	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static CourseComparator getCourseComparator() {
		return courseComparator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}


	
	
}
