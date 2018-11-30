package task_2;

public class Contract_employee extends Employee implements Payment {
int hours;
double rate;
String name;
double id;




	@Override
public String toString() {
	return "Contract_employee [hours=" + hours + ", rate=" + rate + ", name="
			+ name + ", id=" + id + ", Salary=" + calculatePay() + "]";
}




	public Contract_employee(int hours, double rate, String name, double id) {
	super();
	this.hours = hours;
	this.rate = rate;
	this.name = name;
	this.id = id;
}




	public double calculatePay() {
		super.salary=rate*hours;
		return salary;
	}

}
