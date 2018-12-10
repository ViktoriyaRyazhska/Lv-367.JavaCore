import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a & b:");
		
		int a = 0, b = 0;
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | ArithmeticException | IOException e) {
			System.out.println("Not a number!");
			System.out.println(e.getMessage());
		}
		
		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | ArithmeticException | IOException  e) {
			System.out.println("Not a number!");
		}
		

		try {
			System.out.println(squareRectangle(a, b));
		} catch (Exception e) {
			System.out.println("Negative number!");
		}
	}

	static int squareRectangle(int a, int b) throws Exception {
		if (a > 0 && b > 0) {
			return a * b;
		}
		throw new Exception();

	}

}
