package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void main(String[] args) throws IOException {
		String countr1, countr2, countr3;
		double c1,c2,c3,t1,t2,t3,com1,com2,com3,sum;
		System.out.println("Please write 1 country!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		countr1 = br.readLine();
		System.out.println("Please write number of standart units per minute for " + countr1 + "!");
		c1 = Double.parseDouble(br.readLine());
		System.out.println("Please write number of minutes in talk with " + countr1 + "!");
		t1 = Double.parseDouble(br.readLine());
		com1 = c1*t1;
		System.out.println("After count, talk with " + countr1 + " take " + com1 + " units.");
		
		System.out.println("Please write 2 country!");
		countr2 = br.readLine();
		System.out.println("Please write number of standart units per minute for " + countr2 + "!");
		c2 = Double.parseDouble(br.readLine());
		System.out.println("Please write number of minutes in talk with " + countr2 + "!");
		t2 = Double.parseDouble(br.readLine());
		com2 = c2*t2;
		System.out.println("After count, talk with " + countr2 + " take " + com2 + " units.");
		
		System.out.println("Please write 3 country!");
		countr3 = br.readLine();
		System.out.println("Please write number of standart units per minute for " + countr3 + "!");
		c3 = Double.parseDouble(br.readLine());
		System.out.println("Please write number of minutes in talk with " + countr3 + "!");
		t3 = Double.parseDouble(br.readLine());
		com3 = c3*t3;
		System.out.println("After count, talk with " + countr3 + " take " + com3 + " units.");
		
		sum = com1 +com2 +com3;
		System.out.println("Together all talks take " + sum + " units.");
		
	}
}
