package hwpart2;

public abstract class Employee {
	private String name;
	private String employeeId;
	private int wage;
	
	public Employee () {
		
	}
	
	public Employee (String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public int getWage() {
		return wage;
	}


	public void setWage(int wage) {
		this.wage = wage;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + wage;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (wage != other.wage)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", wage=" + wage + "]";
	}
	
	
}
