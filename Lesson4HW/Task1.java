package homeworkl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void floatnum(float fn1, float fn2, float fn3) {

		if (fn1 > -5 && fn1 < 5) {
			System.out.println("First number is in range!");
		} else {
			System.out.println("Number 1 is out of range!");
		}
		if (fn2 > -5 && fn2 < 5) {
			System.out.println("Second number is in range!");
		} else {
			System.out.println("Number 1 is out of range!");
		}
		if (fn3 > -5 && fn3 < 5) {
			System.out.println("Third number is in range!");
		} else {
			System.out.println("Number 1 is out of range!");
		}

	}

	public static void intnum(int i1, int i2, int i3) {
		if (i1 > i2) {
			if (i1 > i3) {
				System.out.println("First number is max;");
			} else {

				System.out.println("Third number is max");

			}
		}
		if (i1 < i2) {
			if (i2 > i3) {
				System.out.println("Second number is max;");
			} else {

				System.out.println("Third number is max");
			}
		}
		if (i1 > i2) {
			if (i3 > i2) {
				System.out.println("Second number is min;");
			} else {

				System.out.println("Third number is min");

			}
		}
		if (i1 < i2) {
			if (i1 < i3) {
				System.out.println("First number is min;");
			} else {

				System.out.println("Third number is max");

			}
		}
	}
	
	public static void erorhttp(int er) {

		
		HTTPError error = null;

		switch (er) {
		case 400:
			error = HTTPError.BadRequest;
			break;
		case 401:
			error = HTTPError.Unauthorized;
			break;
		case 402:
			error = HTTPError.PaymentRequired;
			break;
		case 403:
			error = HTTPError.Forbidden;
			break;
		case 404:
			error = HTTPError.NotFound;
			break;
		case 405:
			error = HTTPError.MethodNotAllowed;
			break;
		default:
			System.out.println("Sorry, number is out of range!");
			break;
		}
		System.out.println(er + " Error is " + error + " error;");
		
	}

	public enum HTTPError {
		BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, MethodNotAllowed
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float fn1, fn2, fn3;
		System.out.println("Write 1 float number");
		fn1 = Float.parseFloat(br.readLine());
		System.out.println("Write 2 float number");
		fn2 = Float.parseFloat(br.readLine());
		System.out.println("Write 3 float number");
		fn3 = Float.parseFloat(br.readLine());
		floatnum(fn1, fn2, fn3);

		int i1, i2, i3;
		System.out.println("Write 1 integer number;");
		i1 = Integer.parseInt(br.readLine());
		System.out.println("Write 2 integer number;");
		i2 = Integer.parseInt(br.readLine());
		System.out.println("Write 3 integer number;");
		i3 = Integer.parseInt(br.readLine());
		intnum(i1, i2, i3);

		System.out.println("Please write number of HTTP Error in range [400;405] ");
		int er = Integer.parseInt(br.readLine());
		erorhttp(er);
	}
}
