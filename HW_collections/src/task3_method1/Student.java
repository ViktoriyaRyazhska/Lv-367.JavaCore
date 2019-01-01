package task3_method1;

import java.util.*;

public class Student {

	private String name;
	private int course;
	
	public Student () {
		
	}
	
	public Student (String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public static void printStudents (List<Student> list, Integer course) {
		Iterator<Student> iteratorTest = list.iterator();
		
		while (iteratorTest.hasNext()) {
			
			Student temp = new Student();
			temp = iteratorTest.next();
			
			if (temp.getCourse() == course) {
				System.out.println(temp);
			}
		}
		System.out.println();
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
