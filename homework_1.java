

	package com.edu;
	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


		
	public class homework_1 {
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    
	    System.out.println("---------task1------------"); 
	    System.out.println("Flower bed is shaped like a circle" );
	    System.out.println("Please enter the radius " );
	    double R = Double.parseDouble(br.readLine());
	    System.out.println("Perimetr of bed :" + (2*Math.PI*R));  
		System.out.println("Square(area)of bed : " + (Math.PI*R*R));
	    
	    
	    
	    
	
	System.out.println("---------task2-------------");   
	System.out.println("Hi! What is your name?" );
	String name = br.readLine();
	System.out.println("Name : " + name);  
	
	System.out.println("How old are you?");
	double age = Double.parseDouble(br.readLine());
	System.out.println(name+ " is " + age + " y.o."); 
	
	System.out.println("Where are you live " + name +"?");
	String adress = br.readLine();
	System.out.println("Name : " + name);  
	System.out.println("Age : " + age);
	System.out.println("Adress : " + adress);
	
	
	
	
	
	 System.out.println("---------task3------------"); 
	 
	 System.out.println("Please enter standard unit per minute in Ukraine");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("Please enter standard unit per minute in USA");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("Please enter standard unit per minute in Poland");
		double c3 = Double.parseDouble(br.readLine());
		
		System.out.println("Please enter time of first call");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("Please enter time of second call");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("Please enter time of third call");
		double t3 = Double.parseDouble(br.readLine());
		 System.out.println("---------result------------"); 
		System.out.println("Price of first call in Ukraine : " + c1*t1);
		System.out.println("Price of first call in USA : " + c2*t1);
		System.out.println("Price of first call in Poland : " + c3*t1);
		System.out.println("Price of first call in all countries in general: " + (c3*t1+c2*t1+c3*t1));
		System.out.println("  "); 
		System.out.println("Price of second call in Ukraine : " + c1*t2);
		System.out.println("Price of second call in USA : " + c2*t2);
		System.out.println("Price of second call in Poland : " + c3*t2);
		System.out.println("Price of second call in all countries in general : " + (c3*t2+c2*t2+c3*t2));
		System.out.println("  "); 
		System.out.println("Price of third call in Ukraine : " + c1*t3);
		System.out.println("Price of third call in USA : " + c2*t3);
		System.out.println("Price of third call in Poland : " + c3*t3);
		System.out.println("Price of third call in all countries in general: " + (c3*t3+c2*t3+c3*t3));
		System.out.println("  "); 
	 System.out.println("---------------------------");
	  }
	}


