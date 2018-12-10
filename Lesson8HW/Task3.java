package homeworkl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pattern pattern = Pattern.compile("^\\$(\\d+)(\\.\\d{2})+");
		System.out.println("Write how many currensy you have");
		int c = Integer.parseInt(br.readLine());
		List<String> currency = new ArrayList<String>();
		for (int i = 0; i < c; i++) {

			System.out.println("Enter currency type $777.77 N " + i);
			currency.add(br.readLine());
		}
		for (int i = 0; i < currency.size(); i++) {

			Matcher m = pattern.matcher(currency.get(i));
			if(m.matches()) {
				System.out.println("All what you write is ok!YUPPI");
			}else {
				System.out.println("Ups smth is wrog, sorry ;)");
			}
			
			m.reset();
			while (m.find()) {
				System.out.println(currency.get(i).substring(m.start(), m.end()));
			}
		}

	}

}
