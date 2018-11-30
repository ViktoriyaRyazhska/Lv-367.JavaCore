package task_1;
public class Swallow extends Flying_bird {
	 private int age;
	   private String where_live="";
	public String toString() {
		return "Swallow [age=" + age + ", where_live=" + where_live
				+ ", feathers=" + feathers + ", lay_eggs=" + lay_eggs
				+ ", fly()=" + fly() + "]";
	}
	public Swallow(int age) {
		super();
		this.age = age;
		
		 super.feathers=false;
	}
	public static String type_bird = "Swallow";
	 
	void print() {
		
		
		System.out.println(type_bird);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
