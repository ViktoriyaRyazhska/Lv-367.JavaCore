
public class task7 {
	public void factorial() {
		int i, fact = 1;
		int number = 8; // It is the number to calculate factorial \
		int[] p = new int[number];
		for (int k = number ; k >0;k--) {
			
				p[number-k] = k;
			
		}

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.print("Factorial of " + number + " is: " + number);
		for (int k = 1; k < p.length; k++) {

			System.out.print("*" + p[k]);
		}
		System.out.print("= " + fact);
	}

}
