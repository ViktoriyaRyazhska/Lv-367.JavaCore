package task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		System.out.println("Write 10 numbers between 1 and 100 in the ascending order:");
		int temp = 1; 
		for (int i = 0; i < a.length; i++) {
			a[i] = readNumber(temp,100);
			temp = a[i];
		}
		System.out.println("All fine!");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int readNumber(int start, int end) throws NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int entered = 0;
		try {
			entered = Integer.parseInt(br.readLine());
			if (entered >= start && entered <= end) {
				return entered;
			}
			else {
				throw new NumberFormatException("Wrong number!");
			}
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return entered;
		
	}
	
}
