package homeworkl4;

public class Dog {
	private String name;
	enum Breed{
		Haski, Laika, Akita;
	}
	Breed breed = null;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog name = " + name + ", age = " + age + ", breed = " + breed ;
	}
	
	
	
}
