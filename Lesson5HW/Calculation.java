package homeworkl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation {
	public static void numbers() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Pls write  10 int numbers ");
		int[] numbers = new int[9];
		boolean pos = true;
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if(i<5 && numbers[i] <0) {
				pos = false;
			}
			
		}
		int sum =0;
		if (pos == true) {
			for (int i=0;i<5;i++) {
				sum+=numbers[i];
			}
			
		}
		else {
			for(int i=5;i<10;i++) {
				sum+=numbers[i];
			}
		}
		if(pos==true) {
			System.out.println("Sum of first 5 numbers are " + sum);
		}
		else {
			System.out.println("Sum of last 5 numbers are " + sum);
		}
	}
}
