	package task3_method2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Set<Student> myStudentsSet = new TreeSet<Student>(Student.getNameComparator());
		
		myStudentsSet.add(new Student("Student1", 2));
		myStudentsSet.add(new Student("Peter", 3));
		myStudentsSet.add(new Student("Mike", 2));
		myStudentsSet.add(new Student("Taras", 5));
		myStudentsSet.add(new Student("Rat", 1));
		
		System.out.println("Enter the course number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int course = Integer.parseInt(br.readLine());
		
		Student.printStudents(myStudentsSet, course);
		System.out.println();
		
		System.out.println("Sorted by name:");
		System.out.println(myStudentsSet);
		
		Set<Student> myStudentsSet1 = new TreeSet<Student>(Student.getCourseComparator()); 
		myStudentsSet1.addAll(myStudentsSet);
		System.out.println("Sorted by course:");
		System.out.println(myStudentsSet1);
				
		
	}
	
}
