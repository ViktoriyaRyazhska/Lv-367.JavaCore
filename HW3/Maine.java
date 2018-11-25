package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person pr = new Person();

		System.out.println("Enter name = ");
		pr.getName();
		pr.setName(br.readLine());

		System.out.println("Enter birthYear=");
		pr.getBirthYear();
		pr.setBirthYear(Integer.parseInt(br.readLine()));
		
		Person pr1 = new Person();

		System.out.println("Enter name = ");
		pr1.setName(br.readLine());

		System.out.println("Enter birthYear=");
		pr1.setBirthYear(Integer.parseInt(br.readLine()));
			
			
			Person pr2 = new Person();

			System.out.println("Enter name = ");
			pr2.setName(br.readLine());

			System.out.println("Enter birthYear=");
			pr2.setBirthYear(Integer.parseInt(br.readLine()));
			
			Person pr3 = new Person();

			System.out.println("Enter name = ");
			pr3.setName(br.readLine());

			System.out.println("Enter birthYear=");
			pr3.setBirthYear(Integer.parseInt(br.readLine()));
			
			System.out.println("Change same name ");
			pr3.setName(br.readLine());
			
			System.out.println(pr+" "+pr1+" "+pr2+"	"+pr3);
			
			
	}

}
