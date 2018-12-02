package homeworkl6_2;

public class ContractEmployee extends Employee{
	private String socialSecurityNumber;
	
	@Override
	public void  calculatePay() {
		setMonthlySalary(getMonthlySalary());
		
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	@Override
	public String toString() {
		return "Contract Employee social Security Number = " + socialSecurityNumber + ", Employee ld = " + getEmployeeld()
				+ ", Name = " + getName() + ", Monthly Salary = " + getMonthlySalary() + ";";
	}

}
