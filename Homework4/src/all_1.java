import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class all_1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mon = new int[12];
		mon[0] = 31;
		mon[1] = 28;
		mon[2] = 31;
		mon[3] = 30;
		mon[4] = 31;
		mon[5] = 30;
		mon[6] = 31;
		mon[7] = 31;
		mon[8] = 30;
		mon[9] = 31;
		mon[10] = 30;
		mon[11] = 31;
		System.out.println("Please enter  number of month ");
		int month;
		month = Integer.parseInt(br.readLine());
		for (int i = 0; i < mon.length; i++) {
			if (mon[i] == mon[month - 1]) {
				System.out.println(" in " + (month) + " month"
						+ " number of days  = " + mon[i]);
				break;
			}
		}
		System.out.println("***************************************");
		int[] numbers = new int[10];			
		System.out.println("Please enter 10 numbers ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;	
		int p = 1;
		for (int i = 0; i < numbers.length; i++) {	
			
			if ((numbers[i] > 0)&&(i<=4)) {
				sum += numbers[i];
			} 
			else
			{
			 if(i>4){				
             p *=numbers[i];           
			 }
			}
			
		}
		if(p==1){
		System.out.println("result = " + sum);
		}
		else{System.out.println("result = " + p);}


		System.out.println("***************************************");
		
		int[] numbers1 = new int[5];		
		System.out.println("Please enter 5 numbers ");
		for (int i = 0; i < numbers1.length; i++) {
			numbers1[i] = Integer.parseInt(br.readLine());
		}
		
		int pos=0;
		int min=numbers1[0];
		int imin=0;
		for (int i=0;i <numbers1.length; i++) {
			
			if (numbers1[i] > 0) {
				pos++;			
				if (pos==2){System.out.println("position of second positive number is "+(i+1)); }
			}
			if (numbers1[i]<min){min=numbers1[i];imin=i;}		
			
		}
		System.out.println(" ");
		System.out.print("Minimum = " +min);
		System.out.print(" is in " + (imin + 1) + " place");
	}
}
