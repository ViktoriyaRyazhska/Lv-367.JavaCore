package homeworkl9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static double div(Double d1, Double d2) throws MyException {
		if (d2 == 0.0) {
			d1 = d1 / d2;
		} else {
			throw new MyException("Second number is 0");
		}
		return d1;
	}

	static int readNumber(int start, int end) throws MyException {
		int num = 0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
		}
		if (num > start && num < end) {
			return num;
		} else {
			throw new MyException("Num is out of range");
		}

	}

	public static void main(String[] args) {
		int[] a = new int[9];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Write number bigger than 1 and smaller than 100:");
			try {
				a[i] = readNumber(1, 100);
			} catch (MyException e) {

				System.out.println(e.getMessage());
				i--;
			}
		}
		System.out.println("Array that we have:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

}
