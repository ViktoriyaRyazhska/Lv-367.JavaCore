package edu.com;

public class student {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ira", 5, 120);
		System.out.println(e1);
		Employee e2 = new Employee("Oleg", 2, 12);
		System.out.println(e2);
		e2.setRate(12);
		System.out.println("Total Sum = " + Employee.totalSum);
		System.out.println();
	}
	
}
