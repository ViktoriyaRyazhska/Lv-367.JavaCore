import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input your line:");
		String str = br.readLine();
		
		String rstr = str.trim();
		str = rstr;
		
		Pattern p = Pattern.compile(" {2}");
		Matcher m = p.matcher(str);
		
		while (m.find()) {
			rstr = str.replace("  ", " ");
			str = rstr;
		}
		
		System.out.println(str);

	}

}
