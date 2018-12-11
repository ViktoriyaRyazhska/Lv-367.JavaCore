package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the US currency ");
		String pattern = "[$][0-9]+[.][0-9]{2}";
	//	String pattern = "($)(\\d+)(.*)(\\d{2})";

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String text =reader.readLine();
		
		//String text ="Orest k Petro wqe_rrq213434898 Ivan";
		String[] q=text.split(" ");
		Pattern p = Pattern.compile(pattern);
		for(int i=0 ; i<q.length ; i++) {
		Matcher m = p.matcher(q[i]);
		if (m.matches()) {
			  System.out.print(q[i]+" matches the US currency");
			  System.out.println();
			}		
			else
			{
			  System.out.println(q[i] + " Wrong input");
			}
		}
	}

}
