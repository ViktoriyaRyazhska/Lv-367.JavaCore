package Tasks;

public class Task4 {
	private String letter;
	private int letnum = 0;
	private String[] loud = { "a", "e", "i", "o", "u", "y" };

	public Task4(String letter) {

		this.letter = letter;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public void calculate() {
		
		for (int i = 0; i < loud.length; i++) {
			int t = letter.length();
			letter = letter.replaceAll(loud[i], "");
			
			letnum += t - letter.length();
			
		}

	}

	@Override
	public String toString() {
		return "Tekst has " + letnum + " loud! ";
	}

}
