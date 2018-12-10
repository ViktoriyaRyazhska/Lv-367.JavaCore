package homeworkl7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Student {
	String name;
	Integer course;

	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student name = " + name + ", course = " + course + ";";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		Random rand = new Random();
		result = rand.nextInt(50) * prime * result + ((course == null) ? 0 : course.hashCode());
		result = rand.nextInt(50) * prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static class nameComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
				
	}
	public static class courseComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getCourse()-o2.getCourse();
		}
		
		
		
	}
	public void printStudents(List students, Integer course) {
		Iterator iterator = students.iterator();

		while(iterator.hasNext()) {
			Student student = (Student) iterator.next();
			if(student.getCourse()==course) {
				System.out.println(student.getName());
			}
		}
	}

}
