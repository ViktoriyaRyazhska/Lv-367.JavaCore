import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Employee E1 = new Employee();
		
		System.out.println("Enter employee name:");
		E1.setName(br.readLine());
		
		System.out.println("Enter employee rate:");
		E1.setRate(Integer.parseInt(br.readLine()));
		
		System.out.println("Enter employee hours:");
		E1.setHours(Integer.parseInt(br.readLine()));
		
		
		Employee E2 = new Employee("Olya", 7);
		E2.setHours(8);
		
		
		Employee E3 = new Employee("Katya", 5, 8);
		
		System.out.println(Employee.getTotalSum());
		
	}

}
