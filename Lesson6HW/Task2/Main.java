package homeworkl6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Employee we have?");
		int empnum = Integer.parseInt(br.readLine());
		Employee[] employee = new Employee[empnum];
		System.out.println("How many Employee work by contract?");
		int contract = Integer.parseInt(br.readLine());
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Please write name:");
			if (i<contract) {
				employee[i] = new ContractEmployee();
			
				employee[i].setEmployeeld(Integer.toString ((int)(Math.random() * 100)));
				employee[i].setMonthlySalary((Math.random() * 10000));
				((ContractEmployee) employee[i]).setSocialSecurityNumber(Integer.toString ((int)(Math.random() * 10000000)));;
				
			}
			else {
				employee[i] = new SalariedEmployee();
				employee[i].setEmployeeld(Integer.toString ((int)(Math.random() * 100)));
				((SalariedEmployee) employee[i]).setHourlyRate((Math.random() * 100));
				((SalariedEmployee) employee[i]).setOursWorked((Math.random() * 100));
				((SalariedEmployee) employee[i]).setSocialSecurityNumber(Integer.toString ((int)(Math.random() * 10000000)));;
				
			}
			employee[i].setName(br.readLine());
			employee[i].calculatePay();
			
		}
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());
		}
	}

}
