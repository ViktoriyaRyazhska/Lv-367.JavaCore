package task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

	public static void main(String[] args) throws IOException {
		//task1
		System.out.println("Please enter the sentence ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sen =reader.readLine();
		String[] n=sen.split(" ");
		int max = n[0].length();
		String s="";
		for (int i=0; i<n.length;i++)
		{
			if (n[i].length()>max)
			{
				max=n[i].length();
				s=n[i];			
			}			 
		}
		  System.out.println( "max number of letters "+max +" in "+s);
//		  StringBuilder input1 = new StringBuilder(); 
//		  input1.append(n); 
//		  input1.reverse();
//		 String [] res=input1.
		  System.out.println( "second word in reverse order "+n[n.length-2]);
		 
		

		  
	}

}
