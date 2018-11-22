package package_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius:");
		int radius = Integer.parseInt(br.readLine());
		
		System.out.print("The flowerbed perimeter is: ");
		System.out.println(2 * Math.PI * radius);
		
		System.out.print("The area of the flowerbed is: ");
		System.out.print(Math.PI * radius * radius);
	}

}
