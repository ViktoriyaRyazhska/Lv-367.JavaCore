package hwpart2;

public class SalariedEmployee extends Employee implements SomeInterface {
	private int salary;
	private int hours;
	private String socialSecurityNumber;
	
	public SalariedEmployee() {
		//super should be here?
	}
	
	public SalariedEmployee(String name, String employeeId, int salary, int hours, String socialSecurityNumber) {
		super(name, employeeId);
		this.salary = salary;
		this.hours = hours;
		CalculatePay();
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int CalculatePay() {
		setWage(salary * hours);
		return 0;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	

}
