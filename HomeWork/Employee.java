package edu.com;

public class Employee {

	private String name;
	private int hours;
	private int rate;
	
	public static double totalSum = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		totalSum -= salary();
		this.rate = rate;
		totalSum += salary();
	}

	public Employee(String name, int hours, int rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;	
		totalSum += salary();
		
	}
	
	public int salary() {
		return hours*rate;
		
	}
	
	public float bonus() {
		return (float) (salary()*0.1);
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + ", salary=" + salary()
				+ ", bonus=" + bonus() + "]";
	}
	
		
		
	
}

