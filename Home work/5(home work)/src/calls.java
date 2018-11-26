import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calls {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int time1 = Integer.parseInt(br.readLine());
	int price1 = Integer.parseInt(br.readLine());
	System.out.println("Price Ukrain: " + price1*time1);
	
	int time2 = Integer.parseInt(br.readLine());
	int price2 = Integer.parseInt(br.readLine());
	System.out.println("Price Germany: " + price2*time2);
	
	int time3 = Integer.parseInt(br.readLine());
	int price3 = Integer.parseInt(br.readLine());
	System.out.println("Price Portugal: " + price3*time3);
	
	
	System.out.println("All together: " + price1*time1 + price2*time2 + price3*time3);
}
}
