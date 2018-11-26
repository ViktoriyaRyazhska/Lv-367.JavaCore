package homeworkl3;


public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.input("Oleh", 1996);
		p2.input("Vasyl", 1995);
		p3.input("Petro", 1985);
		p4.input("Orest", 1984);
		p5.input("Andriy", 2002);
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
		
	}
}
