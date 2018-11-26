import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class information {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("What is your name? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Where are you live " + (name) + "?");
		String address = br.readLine();
		System.out.println("Information: " + (name + ", from " + address));
	}

}
