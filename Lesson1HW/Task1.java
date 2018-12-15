package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args)  {
	 System.out.println("Hello!");
	 System.out.println("We have flower bad. Pls write radius, we will calculate perimeter and area!");
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 double r = 0;
	try {
		r = Double.parseDouble(br.readLine());
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 double p = 2*3.14*r;
	 System.out.println("Perimeter = " + p + ";");
	 double s = 3.14*Math.pow(r, 2) ;
	 System.out.println("Area = " + s + ";");
	}
}
