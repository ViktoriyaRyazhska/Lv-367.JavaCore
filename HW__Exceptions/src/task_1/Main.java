package task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double one = 0;
		double two = 0;
		try {
			one = Double.parseDouble(br.readLine());
			two = Double.parseDouble(br.readLine());
			
			if (one == 0 && two == 0) {
				throw new ArithmeticException("Two Zero's!");
			}
			else if (two == 0) {
				throw new ArithmeticException("Dividing by zero!");
			}
			
			System.out.println(div(one,two));
		}
		catch (NumberFormatException e1) {
			System.err.println(e1.getMessage() + ": Not a number!");
		}
		catch (ArithmeticException e2) {
			System.err.println(e2.getMessage());
		}
		catch (IOException e3) {
			System.err.println(e3.getMessage());
		}
		catch (Exception e4) {
			System.err.println(e4.getMessage());
		}
		
		
		
	}
	
	public static double div(double first, double second) {
		return first / second;
	}
	
}
