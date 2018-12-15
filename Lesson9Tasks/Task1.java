package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	static int squareRectangle(int a, int b) throws MyException {
		if (a > 0 && b > 0) {
			a = a * b;
		} else {
			throw new MyException("One of numbers is smoller than 0");
		}
		return a;

	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write a ");
		int a = 0;
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Write b ");
		int b = 0;
		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		int S = 0;
		try {
			S = squareRectangle(a, b);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("S = " + S + ";");
	}

}
