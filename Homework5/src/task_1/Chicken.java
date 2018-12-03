package task_1;
public class Chicken extends Non_flying_bird{
	public static String type_bird = "Chicken";
	   private int age;
	   private String where_live="Everywhere";
	void print() {
		System.out.println(type_bird);
		
	}
	public String toString() {
		return "Chicken [age=" + age + ", where_live=" + where_live
				+ ", feathers=" + feathers + ", lay_eggs=" + lay_eggs
				+ ", fly()=" + fly() + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Chicken(int age) {
		super();
		this.age = age;
		super.feathers=true;
	}

}
