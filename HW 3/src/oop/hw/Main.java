package oop.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person P1 = new Person();	
		System.out.print("Enter the person's name: ");
		String name = br.readLine();
		System.out.println("Enter the person's year of the birth: ");
		int birthYear = Integer.parseInt(br.readLine());
		P1.inputPersonsInformation(name,birthYear);
		

		Person P2 = new Person();	
		System.out.print("Enter the person's name: ");
		name = br.readLine();
		System.out.println("Enter the person's year of the birth: ");
		birthYear = Integer.parseInt(br.readLine());
		P2.inputPersonsInformation(name,birthYear);
		

		Person P3 = new Person();	
		System.out.print("Enter the person's name: ");
		name = br.readLine();
		System.out.println("Enter the person's year of the birth: ");
		birthYear = Integer.parseInt(br.readLine());
		P3.inputPersonsInformation(name,birthYear);
		

		Person P4 = new Person();	
		System.out.print("Enter the person's name: ");
		name = br.readLine();
		System.out.println("Enter the person's year of the birth: ");
		birthYear = Integer.parseInt(br.readLine());
		P4.inputPersonsInformation(name,birthYear);
		

		Person P5 = new Person();	
		System.out.print("Enter the person's name: ");
		name = br.readLine();
		System.out.println("Enter the person's year of the birth: ");
		birthYear = Integer.parseInt(br.readLine());
		P5.inputPersonsInformation(name,birthYear);
		
			
		P1.outputPersonsInformation();
		P2.outputPersonsInformation();
		P3.outputPersonsInformation();
		P4.outputPersonsInformation();
		P5.outputPersonsInformation();
		
	}

}
