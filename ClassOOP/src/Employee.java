
public class Employee {

	private String name;
	private int rate;
	private int hours;
	
	private static int totalSum;

	public String getName() {
		return name;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += Salary();
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		totalSum -= Salary();
		this.rate = rate;
		totalSum += Salary();
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static int getTotalSum() {
		return totalSum;
	}
	
	public int Salary() {
		return rate * hours;
		}
			
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", Salary()=" + Salary() + "]";
	}

	public void changeRate(int newRate) {
			this.rate = newRate;
	}
	
	public double showHisBonuses() {
		return (this.getRate() * this.getHours()) * 0.1;
	}

	public double showHisBonuses2() {
		return (rate * hours) * 0.1;
	}
}
	
	
	
	
	