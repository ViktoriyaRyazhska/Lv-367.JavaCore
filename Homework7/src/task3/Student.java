package task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student {

	private String name;
	private String course;

	public Student(String name, String course) {

		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static void printStud(List student) {
		for(int i=0;i<student.size();i++) {System.out.println(student.get(i));}
	}
	public static Comparator<Student> COMPARE_BY_NAME = new Comparator<Student>() {
        public int compare(Student one, Student other) {
            return one.name.compareTo(other.name);
        }		
    };

    public static Comparator<Student> COMPARE_BY_COURSE = new Comparator<Student>() {
        public int compare(Student one, Student other) {
            return one.course.compareTo(other.course);
        }
    };

	public static void main(String[] args) {
		List student = new ArrayList<Student>();
		student.add(new Student("Alina","3 course"));
		student.add(new Student("Petro", "5 course"));
		student.add(new Student("Vasyl", "1 course"));
		student.add(new Student("Ivan", "5 course"));
		student.add(new Student("Stepan", "6 course"));
		student.add(new Student("Vika", "1 course"));
		student.add(new Student("Ira", "3 course"));
		student.add(new Student("Katya", "4 course"));
		student.add(new Student("Sofia", "2 course"));
		student.add(new Student("Milka", "4 course"));
		printStud(student);
		System.out.println();
		System.out.println("************Ordered by name:******************");
		Collections.sort(student, Student.COMPARE_BY_NAME);
		printStud(student);
		System.out.println();
		System.out.println("************Ordered by course:******************");
		Collections.sort(student, Student.COMPARE_BY_COURSE);
		printStud(student);
	}

}
