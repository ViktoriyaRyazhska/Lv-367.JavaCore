package hwpart2;

public class ContractEmployee extends Employee implements SomeInterface {
	private int fixedSalary;
	private String federalTaxIdmember;
		
	public ContractEmployee(String name, String employeeId, int fixedSalary, String federalTaxIdmember) {
		super(name, employeeId);
		this.fixedSalary = fixedSalary;
		CalculatePay();
		this.federalTaxIdmember = federalTaxIdmember;
	}

	
	@Override
	public int CalculatePay() {
		setWage(fixedSalary);
		return 0;
	}


	public int getFixedSalary() {
		return fixedSalary;
	}


	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}


	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}


	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}



	
	
}
