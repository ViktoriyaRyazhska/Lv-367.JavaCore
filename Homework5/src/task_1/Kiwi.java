package task_1;
public class Kiwi extends Non_flying_bird {
	public static String type_bird = "Kiwi";
	   private int age;
	   private String where_live="Ausstralia";
	public Kiwi(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public String toString() {
		return "Kiwi [age=" + age + ", where_live=" + where_live
				+ ", feathers=" + feathers + ", lay_eggs=" + lay_eggs
				+ ", fly()=" + fly() + "]";
	}
	void print() {
		System.out.println(type_bird);
		super.feathers=true;
	}

}
