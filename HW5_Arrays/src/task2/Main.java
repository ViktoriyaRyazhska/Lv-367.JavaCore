package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter 10 integer numbers:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			}
		
		int sum = 0;
		int prod = 1;
		for (int i = 0; i < 5; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
			else {
				for (int j = 5; j < 10; j++) {
					prod *= arr[j];
				}
				System.out.println("Product of the last 5 numbers is:");
				System.out.println(prod);
				break;
			}
			if (i == 4) {
				System.out.println("Sum of the first 5 numbers is:");
				System.out.println(sum);
			}
		}
	
		
	}
}
