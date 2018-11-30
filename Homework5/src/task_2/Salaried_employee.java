package task_2;

public class Salaried_employee extends Employee implements Payment{

int salary_fixed;
String Social_Security_Number;
String name;
double id;

public Salaried_employee(int salary_fixed, String social_Security_Number,
		String name, double id) {
	super();
	this.salary_fixed = salary_fixed;
	Social_Security_Number = social_Security_Number;
	this.name = name;
	this.id = id;
}

@Override
public String toString() {
	return "Salaried_employee [salary_fixed=" + salary_fixed
			+ ", Social_Security_Number=" + Social_Security_Number + ", name="
			+ name + ", id=" + id + ", Salary=" + calculatePay() + "]";
}

public double calculatePay() {
	super.salary=salary_fixed;
	return salary;
}

}
