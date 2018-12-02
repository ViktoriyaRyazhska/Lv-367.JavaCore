package homeworkl6_2;

public class SalariedEmployee extends Employee{
	private String socialSecurityNumber;
	double hourlyRate, oursWorked;
	@Override
	public void calculatePay() {
		setMonthlySalary(oursWorked*hourlyRate);
		
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getOursWorked() {
		return oursWorked;
	}
	public void setOursWorked(double oursWorked) {
		this.oursWorked = oursWorked;
	}
	@Override
	public String toString() {
		return "Salaried Employee social Security Number = " + socialSecurityNumber + ", Employee ld =" + getEmployeeld()
				+ ", Name=" + getName() + ", MonthlySalary = " + getMonthlySalary() + ";";
	}

}
