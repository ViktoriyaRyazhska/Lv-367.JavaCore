import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input a sentence of 5 words:");
		String sentence = input.readLine();
		
		
		String[] arr = sentence.split(" ");
		
		String biggest = new String(arr[0]);
		int i = 1;
	
		while (i < 5) {

			if (arr[i].length() > biggest.length()) {
				biggest = arr[i];
			}
			
			i++;
		}
				
		System.out.println("The longest word in the sentence is: " + biggest);
		System.out.println("The number of its letters is: " + biggest.length());
			
		
		//String reverse = new String();
		StringBuilder sb = new StringBuilder(arr[1]);
		sb.reverse();
		
		
		/*
		String add = new String();
		for (int j = arr[1].length(); j >= 0; j--) {
			for (int r = 0; r < arr[1].length(); r++) {		
//				reverse = arr[1].charAt(j);

				reverse = arr[1].substring(j-1, j);
				add = reverse.concat(reverse + add);
				System.out.println(reverse);
				
			}
		}
		System.out.println(add);
		*/
		
		System.out.println("The second word in reverse order: " + sb + " " + arr[1]);
	}

}
