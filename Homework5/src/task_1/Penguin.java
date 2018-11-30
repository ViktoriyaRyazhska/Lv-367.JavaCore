package task_1;
public class Penguin extends Non_flying_bird{
	public static String type_bird = "Penguin";
	   private int age;
	   private String where_live="Norh_Pole";
	void print() {
		System.out.println(type_bird);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Penguin(int age) {
		super();
		this.age = age;
		super.feathers=false;
		
	}
	public String toString() {
		return "Penguin [age=" + age + ", where_live=" + where_live
				+ ", feathers=" + feathers + ", lay_eggs=" + lay_eggs
				+ ", fly()=" + fly() + "]";
	}

}
