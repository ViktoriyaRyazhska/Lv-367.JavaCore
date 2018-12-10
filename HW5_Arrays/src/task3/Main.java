package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		System.out.println("Enter 5 integer numbers:");
		
		int product = 1;
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] < 0) {
				break;
			}
			else if ((arr[i] % 2) == 0) {
				product *= arr[i];
			}
		}
		System.out.println("The product of all entered even numbers is:");
		System.out.println(product);
		
		
		int positive = 0;
		int position = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
				position = i+1;
				if (positive == 2) {
					System.out.println("Position of the second positive number is:");
					System.out.println(position);
					break;
				}
			}	
		}
			
		int min = arr[0];
		position = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				position = i+1;
			}
		}
		System.out.println("The minimum number is:");
		System.out.println(min);
		System.out.println("Its position is:");
		System.out.println(position);
		
	}

}
