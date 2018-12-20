import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input cost of dollar:");
		int dollarCost = Integer.parseInt(br.readLine());
		
		System.out.println("Input sum of gryvna money:");
		int gryvna = Integer.parseInt(br.readLine());
		
		
		Task3 exchangeMoney = new Task3(dollarCost, gryvna);
		exchangeMoney.printResults();
		
		

	}

}
