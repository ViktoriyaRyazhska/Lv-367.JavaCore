package Origin2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array[] = new int[10];
		
		System.out.println("Input 10 int numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int biggest;
		biggest = array[0];
	
		for (int i = 1; i < array.length; i++) {
			if (biggest < array[i]) {
				biggest = array[i];
			}
		}
		System.out.println("The biggest number is: " + biggest);
		
		int sum = 0;
		int positiveAmount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum += array[i];
				positiveAmount++;
			} 
		}
		System.out.println("The sum of positive numbers in the array is: " + sum);
		
		int negativeAmount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				negativeAmount++;
			} 
		}
		System.out.println("The amount of the negative numbers in the array is: " + negativeAmount);
		
		if (positiveAmount > negativeAmount) {
			System.out.println("There are more Positive numbers!");
		}
		else {
			System.out.println("There are more Negative numbers!");
		}
		
	}

}
