package Tasks;

public class Task8 {
	private int num;
	private boolean test = false;
	private String let = "";

	public Task8(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void calculate(int number) {

		String[] digit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (number > 0 && number < 20)
			let += digit[number];

		else if (number / 1000000 > 0) {

			calculate(number / 1000000);
			let += " million ";
			calculate(number % 1000000);

		}

		else if (number / 100000 > 0) {

			calculate(number / 100000);
			let += " lukh ";
			calculate(number % 100000);

		}

		else if (number / 1000 > 0) {

			calculate(number / 1000);
			let += " thousand ";
			calculate(number % 1000);

		}

		else if (number / 100 > 0) {

			calculate(number / 100);
			let += " hundred ";
			calculate(number % 100);

		}

		else if (number / 10 >= 2) {

			let += " " + tens[number / 10] + " ";
			calculate(number % 10);

		}
	}

	@Override
	public String toString() {
		return let;
	}

}
