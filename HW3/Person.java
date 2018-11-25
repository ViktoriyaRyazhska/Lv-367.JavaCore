package OOP;

public class Person {

	private String name;
	private int birthYear;

	private static int year;

	public Person() {
	}

	public Person(String name, int birthYear ) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		Person.year = year;
	}

	public int NowYear() {
		return 2018 - birthYear;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + 
						birthYear + ", year=" + NowYear() + "]";
	}

	public void newName(String newName) {
		this.name = newName;
	}

}
