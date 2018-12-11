package task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the sentence ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sen =reader.readLine();
		String after = sen.trim().replaceAll(" +", " ");
		
		
		System.out.print("fixed sentence: "+after);
//int n=1000;
//String [] k =sen.split(" ",n);
//		for (int i=0;i<k.length;i++)
//		{
//		if ((k[i]=="I")||(k[i]=="am"))
//		{
//			k[i]="I'm";
//			k[i+1]="";
//			System.out.print(k[i]);
//		}
//		else
//		{
//			System.out.print(k[i]);
//		}			
//			System.out.print(k[i]);
//		}
		
		
		
		
		
//		  String[] tests = {
//			        "  x  ",          // [x]
//			        "  1   2   3  ",  // [1 2 3]
//			        "",               // []
//			        "   ",            // []
//			    };
//			    for (String test : tests) {
//			        System.out.format("%s%n",
//			            test.replaceAll("^ +| +$|( )+", "$1")
//			        );
//			    }
	}

}
