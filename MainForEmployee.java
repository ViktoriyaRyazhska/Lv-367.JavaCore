package Origin2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForEmployee {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] em = new Employee[5];
		
		for (int i = 0; i < 5; i++) {
			em[i] = new Employee();
			System.out.println("Enter " + i + " employee name:");
			em[i].setName(br.readLine());
			
			System.out.println("Enter " + i + " employee department number:");
			em[i].setDepartmentNumber(Integer.parseInt(br.readLine()));
			
			System.out.println("Enter " + i + " employee salary:");
			em[i].setSalary(Integer.parseInt(br.readLine()));
		}
		
		System.out.println("Enter department number: ");
		int depNum = Integer.parseInt(br.readLine());
		System.out.println("Employees of this department number:");
		for (int i = 0; i < 5; i++) {
			if (em[i].getDepartmentNumber() == depNum) {
				System.out.print(em[i].getName() + "; ");
			}
		}
		
		System.out.println();
		Employee tmp;
		for (int i = 0; i < em.length - 1; i++) {
			for (int j = i + 1; j < em.length; j++) {
				if (em[i].getSalary() < em[j].getSalary()) {
					tmp = em[i];
					em[i] = em[j];
					em[j] = tmp;
				}
			}
		}

		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i]);
		}

//		max(2,3,4)
		
	}
	
	static int max(int n1, int n2, int n3) {
		//.n1..n1.
		
		return n1;
	}

}
