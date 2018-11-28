package Hw4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maine {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Write First number number");
		float a = Float.parseFloat(br.readLine());

		System.out.println("Write second number");
		float b = Float.parseFloat(br.readLine());

		System.out.println("And one more");
		float c = Float.parseFloat(br.readLine());
		
		if(a<-5 || a>5 || b<-5 || b>5 || c<-5 || c>5) {
			System.out.println("One number not fit");
		}
		else {
			System.out.println("All number fit:" + "["+a+", "+b+", "+c+"]");
		}
		
		if(a>b && a>c) {
			System.out.println("Max: "+a);
		}
		else if(b>c && b>a) {
			System.out.println("Max: "+b);
		}
		else {
			System.out.println("Max: "+c);
		}

		if(a<b && a<c) {
			System.out.println("Min: "+a);
		}
		else if(b<c && b<a) {
			System.out.println("Min: "+b);
		}
		else {
			System.out.println("Min: "+c);
		}
	}

}
