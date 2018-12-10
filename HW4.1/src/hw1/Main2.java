package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 integer numbers:");
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Max is " + num1 + "!");			
			if (num2 < num3) {
				System.out.println("Min is " + num2 + "!");
			}
			else {
				System.out.println("Min is " + num3 + "!");
			}
			}
		
		else if (num2 > num3) {
			System.out.println("Max is " + num2 + "!");
			if (num3 > num1) {
				System.out.println("Min is " + num1 + "!");
			}
			else {
				System.out.println("Max is " + num3 + "!");
			}
		}
		else {
			System.out.println("Max is " + num3 + "!");
			if (num1 > num2) {
			System.out.println("Min is " + num2 + "!");
			}
			else {
				System.out.println("Min/ is " + num1 + "!");
			}
		}
		
		
	}

}
