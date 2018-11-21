package Hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write radius");
		int radius = Integer.parseInt(br.readLine());
		System.out.println("Perimetre is = " + radius*2*Math.PI);
		System.out.println("Area is = " + Math.PI * radius*radius );
	}

}
