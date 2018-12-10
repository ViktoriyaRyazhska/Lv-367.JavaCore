package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 3 float numbers:");
		
		
			float number = Float.parseFloat(br.readLine());
			
			if (number <= 5 && number >= -5) {
				number = Float.parseFloat(br.readLine());
				if (number <= 5 && number >= -5) {
					number = Float.parseFloat(br.readLine());
					if (number <= 5 && number >= -5) {
						System.out.println("All numbers belong to the range!");
					}
					else {
						System.out.println("Not every number belong to the range!");
					}
				}
				else {
					System.out.println("Not every number belong to the range!");
				}
			}
			else {
				System.out.println("Not every number belong to the range!");
			}
		
			
	}

}
