package Lesson4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maine {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Employee[] emp = {
				new Employee("Vasya", 1, 100),
				new Employee("Olga", 2, 123),
				new Employee("Igor", 1, 34)
		};

		System.out.println("Write number");
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < emp.length; i++) {
			if(emp[i].getDepartmentNumber() == n){
				System.out.println(emp[i]);
			}

		
		}
		
		System.out.println("Sort salary");
		
		
		Employee c;
		for(int a =0 ; a<emp.length; a++) {
			for(int b =a+1; b<emp.length; b++) {
			if(emp[a].getSalary() < emp[b].getSalary()) {
				c=emp[a];
				emp[a] =emp[b];
				emp[b] = c;
				}
			}
			System.out.println(emp[a]);

		}

	}

}
