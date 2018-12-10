package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map employeeMap = new HashMap<Integer, String>();
		employeeMap.put(0, "Oleh");
		employeeMap.put(1, "Vasyl");
		employeeMap.put(2, "Andriy");
		employeeMap.put(3, "Maryan");
		employeeMap.put(4, "Anton");
		employeeMap.put(5, "Petro");
		employeeMap.put(6, "Hnat");
		System.out.println("Write id of pernson");
		int id = Integer.parseInt(br.readLine());
		if (employeeMap.containsKey(id) == true) {
			System.out.println(id + " " + employeeMap.get(id));

		} else {
			System.out.println("Error");
		}
		System.out.println("Write name of person");
		String name = br.readLine();
		if (employeeMap.containsValue(name) == true) {
			for (int i = 0; i < employeeMap.size(); i++) {
				if (employeeMap.get(i).equals(name)) {
					System.out.println(i + " " + name);
				}
			}

		} else {
			System.out.println("Error");
		}
	}

}
