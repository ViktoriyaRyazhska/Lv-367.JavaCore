package Hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("First call");
		int c1 = Integer.parseInt(br.readLine());
		System.out.println("Standart units "+c1+" grn/per minute");
		System.out.println("How much person tolk?");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("First tolk  " + t1 + " minute");
		System.out.println("The man paid " + c1*t1);
		
		System.out.println("Second call");
		int c2 = Integer.parseInt(br.readLine());
		System.out.println("Standart units "+c2+" grn/per minute");
		System.out.println("How much person tolk?");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println(" Two " + t2 + " minute");
		System.out.println("The man paid " + c2*t2);
		
		System.out.println("Three time call");
		int c3 = Integer.parseInt(br.readLine());
		System.out.println("Standart units "+c3+" grn/per minute");
		System.out.println("How much person tolk?");
		int t3 = Integer.parseInt(br.readLine());
		System.out.println(" Three " + t3 + " minute");
		System.out.println("The man paid " + c3*t3);
		
		System.out.println("First pay "+c1*t1 + " Scond pay "+c2*t2 + " Thee man " + c3*t3);
		System.out.println("Thay pay:");
		System.out.println(c1*t1+c2*t2+c3*t3);
	}

}
