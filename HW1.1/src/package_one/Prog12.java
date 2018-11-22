package package_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name, address;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		name = br.readLine();
				
		System.out.println("Where do you live, "+name+"?");
		address = br.readLine();
		
		System.out.println(name+" lives in "+address+".");
	}

}
