package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void main(String[] args) {
		String countr1 = null, countr2 = null, countr3 = null;
		double c1 = 0, c2 = 0, c3 = 0, t1 = 0, t2 = 0, t3 = 0, com1 = 0, com2 = 0, com3 = 0, sum = 0;
		System.out.println("Please write 1 country!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			countr1 = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please write number of standart units per minute for " + countr1 + "!");
		try {
			c1 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please write number of minutes in talk with " + countr1 + "!");
		try {
			t1 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		com1 = c1 * t1;
		System.out.println("After count, talk with " + countr1 + " take " + com1 + " units.");

		System.out.println("Please write 2 country!");
		try {
			countr2 = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please write number of standart units per minute for " + countr2 + "!");
		try {
			c2 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please write number of minutes in talk with " + countr2 + "!");
		try {
			t2 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		com2 = c2 * t2;
		System.out.println("After count, talk with " + countr2 + " take " + com2 + " units.");

		System.out.println("Please write 3 country!");
		try {
			countr3 = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please write number of standart units per minute for " + countr3 + "!");
		try {
			c3 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please write number of minutes in talk with " + countr3 + "!");
		try {
			t3 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		com3 = c3 * t3;
		System.out.println("After count, talk with " + countr3 + " take " + com3 + " units.");

		sum = com1 + com2 + com3;
		System.out.println("Together all talks take " + sum + " units.");

	}
}
