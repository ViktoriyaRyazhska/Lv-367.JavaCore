package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 4 cars information:");
		
		Car[] inst = new Car[4];
		
		for (int i = 0; i < inst.length; i++) {
			inst[i] = new Car();
			System.out.println("Enter the type of the " + (i+1) + " car:");
			inst[i].setType(be.readLine());
			System.out.println("Enter the year of the " + (i+1) + " car:");
			inst[i].setYear(Integer.parseInt(be.readLine()));
			System.out.println("Enter the engine capacity of the " + (i+1) + " car:");
			inst[i].setCapacity(Double.parseDouble(be.readLine()));
		}
		
		
		System.out.println("Enter car year:");
		int year = Integer.parseInt(be.readLine());
		
		System.out.println();
		System.out.println("The cars from this year:");
		for (int i = 0; i < 4; i++) {
			if (inst[i].getYear() == year) {
				System.out.println(inst[i]);
			}
		}
		
		Car temp = new Car();
		
		for (int i = 0; i < inst.length; i++) {
			for (int j = i + 1; j < inst.length; j++) {
				if (inst[i].getYear() < inst[j].getYear()) {
					temp = inst[i];
					inst[i] = inst[j];
					inst[j] = temp;
				}
			}	
		}
		
		System.out.println();
		System.out.println("All cars ordered by the field \"year\":");
		for (int i = 0; i < inst.length; i++) {
			System.out.println(inst[i]);
		}
		
	}

}
