package package_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter C1:");
		int C1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter C2:");
		int C2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter C3:");
		int C3 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter T1:");
		int T1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter T1:");
		int T2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter T3:");
		int T3 = Integer.parseInt(br.readLine());
		
		System.out.println("First talk will costs "+C1*T1+" units");
		System.out.println("Second talk will costs "+C2*T2+" units");
		System.out.println("Third talk will costs "+C3*T3+" units");
		System.out.print("All talks will cost "+(C1*T1+C2*T2+C3*T3)+" units");
				
		
	}

}
