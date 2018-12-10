package homeworkl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List students = new ArrayList<Student>();
		System.out.println("Write how many student we have");
		int std = Integer.parseInt(br.readLine());
	
		for (int i = 0; i < std; i++) {
			System.out.println("Write name and course");
			Student stud = new Student(br.readLine(), Integer.parseInt(br.readLine()));
			students.add(stud);
		}
		Student.courseComparator compare = new Student.courseComparator();
		students.sort(compare);
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		System.out.println();
		Student.nameComparator compareName = new Student.nameComparator();
		students.sort(compareName);
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

}
