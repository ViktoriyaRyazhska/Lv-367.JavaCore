package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int mdays[ ]  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of month:");
		int number = Integer.parseInt(br.readLine());
		
		System.out.println("The amount of days in this month:");
		System.out.println(mdays[number-1]);
		
	}

}
