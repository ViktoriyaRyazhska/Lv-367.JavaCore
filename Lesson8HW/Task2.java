package homeworkl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write sentence ");
		String letter = br.readLine();
		
		/*letter.replaceAll("  ", " ");
		letter.replaceAll("I am", "I`m");*/
		System.out.println(letter);
		String[] tab = letter.split(" ");
		StringBuilder newLetter = new StringBuilder();
		newLetter.append("");
		for (int i = 0; i < tab.length; i++) {
			newLetter.append(tab[i]).append(" ");
			
		}
		System.out.println(newLetter.toString());
		String newstrletter = newLetter.toString();
		newstrletter.replaceAll("I am", "I'm");
		System.out.println(newstrletter);
	}

}
