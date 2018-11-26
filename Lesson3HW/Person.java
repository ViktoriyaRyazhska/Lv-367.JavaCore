package homeworkl3;

public class Person {
	private String name;
	private int year;
	
	
	public Person() {
		
	}
	public Person(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void changeName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Persons name is " + name + ", year of birth is " + year + ", age of peson is " + age() + ";";
	}
	public int age(){
		return 2018-this.year;
	}
	public void input(String name, int year) {
		this.name = name;
		this.year = year;
		
	}
	public void output() {
		System.out.println(toString());
	}
	
	
}
