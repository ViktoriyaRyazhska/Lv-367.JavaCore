package Hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {

	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What your name?");
		String name = br.readLine();
		System.out.println("May name is " + name);
		System.out.println("Where are you live?" + name);
		String adres = br.readLine();
		System.out.println("I live in " + adres);


		
	}

}
