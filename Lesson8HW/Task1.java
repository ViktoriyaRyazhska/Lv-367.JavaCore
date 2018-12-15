package homeworkl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write sentence ");
		String letter = null;
		try {
			letter = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] tab = letter.split(" ");
		int maxlength=tab[0].length(),id = 0;
		for (int i = 1; i < tab.length; i++) {
			if(tab[i].length()>maxlength) {
				maxlength = tab[i].length();
				id = i;
			}
		}
		System.out.println();
		System.out.println("Bigest word in letter is " + tab[id]);
		maxlength=0;
		System.out.println();
		for (int i = 0; i < tab.length; i++) {
			id = i+1;
			System.out.println(id +" word has "+ tab[i].length() +" letters");
			maxlength+=tab[i].length();
		}
		System.out.println();
		StringBuffer buf = new StringBuffer(tab[1]);
		System.out.println("Second reversed word is " + buf.reverse());
		
	}

}
