package task3_method1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		List<Student> myStudentsList = new ArrayList<Student>();
		
		myStudentsList.add(0, new Student("Student1", 2));
		myStudentsList.add(1, new Student("Peter", 3));
		myStudentsList.add(2, new Student("Mike", 2));
		myStudentsList.add(3, new Student("Taras", 5));
		myStudentsList.add(4, new Student("Rat", 1));
		
		
		System.out.println("Enter the course number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int course = Integer.parseInt(br.readLine());
		
		Student.printStudents(myStudentsList, course);
		
		System.out.println("Sorted by name:");
		myStudentsList.sort(new NameComparator());
		
		for (Student s : myStudentsList) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("Sorted by course:");
		myStudentsList.sort(new CourseComparator());
		
		for (Student s : myStudentsList) {
			System.out.println(s);
		}
	}
	
}
