package oop.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 5;

		while (count > 0) {

			Person P1 = new Person();
			
			System.out.print("Enter the person's name: ");
			String name = br.readLine();
			
			System.out.println("Enter the person's year of the birth: ");
			int birthYear = Integer.parseInt(br.readLine());
			
			P1.inputPersonsInformation(name,birthYear);
			count--;
		}
	}

}
