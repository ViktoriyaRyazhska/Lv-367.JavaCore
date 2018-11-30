package task_1;
public class Eagle extends Flying_bird{
	public static String type_bird = "Eagle";
   private int age;
   private String where_live="in mountains";
	public String toString() {
	return "Eagle [age=" + age + ", where_live=" + where_live + ", feathers="
			+ feathers + ", lay_eggs=" + lay_eggs + ", fly()=" + fly() + "]";
}
	public Eagle(int age) {
	super();
	this.age = age;

	 super.feathers=true;
}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void print() {
		System.out.println(type_bird);
		
	}
	
}
