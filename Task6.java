package Tasks;

public class Task4 {
	private String letter;
	private int letnum;

	public Task4(String letter) {
		super();
		this.letter = letter;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public void calculate() {
		String[] tab = letter.split(" ");
		letnum = tab.length;
	}

	@Override
	public String toString() {
		return "Tekst has " + letnum + " letters! ";
	}

}
