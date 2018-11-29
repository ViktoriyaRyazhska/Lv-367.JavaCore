package homeworkl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Position {
	public static void numbers() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Pls write  5 int numbers ");
		int[] numbers = new int[4];
		int positive = 0, positionpos = -1, positionmin = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if(numbers[i]<0) {
				break;
			}
		}
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positive++;
				if (positive == 2) {
					positionpos = i;
				}
			}
			if( min>numbers[i]) {
				min = numbers[i];
				positionmin =i;
			}
			
		}
		positionpos++;
		positionmin++;
		System.out.println("Position of 2 positive number is " + positionpos);
		System.out.println("Position of min number is " + positionpos + ", min number is " + min);

	}
}
