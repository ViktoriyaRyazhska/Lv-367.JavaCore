	import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import sun.util.resources.LocaleData;


public class Person {
	private String name;
	private double birthYear;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public double getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(double birthYear) {
		this.birthYear = birthYear;
	}

	//constructor with 2 param
	public Person(String name, double birthYear) {
	
		this.name = name;
		this.birthYear = birthYear;
	}
//default constructor
	public Person() {

	
	}
	
	public double age() {
		return 2018-this.birthYear;
	//LocaleDate.now()
	}
	 
	public  void Input() throws NumberFormatException, IOException
	{
		System.out.println("Please enter birthYear : ");
		 birthYear = Double.parseDouble(br.readLine());
		 System.out.println("Please enter Name : ");
		 name = br.readLine();
	}
	public  void Output()
	{
		System.out.println("Name : " + name);  
		System.out.println("Age : " + age());
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		Person p = new Person();
		
		p.Input();
		p.setName("qwq");
     p.Output();
	}

}
