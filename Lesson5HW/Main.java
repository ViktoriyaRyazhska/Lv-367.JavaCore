package homeworkl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Write number of month ");
		MonthDay.checkmonth(Integer.parseInt(br.readLine()));

		Calculation.numbers();

		Position.numbers();

		Car[] cars = new Car[3];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
			System.out.println("Write type of car ");
			cars[i].setType(br.readLine());
			System.out.println("Write yerar of production ");
			cars[i].setYear(Integer.parseInt(br.readLine()));
			System.out.println("Write engine capacity");
			cars[i].setCapacity(Double.parseDouble(br.readLine()));
		}
		System.out.println("Write certain model year");
		int year = Integer.parseInt(br.readLine());

		System.out.println("Cars from " + year + " year:");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYear() == year) {
				System.out.println(cars[i]);
			}

		}
		Car car = new Car();
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() < cars[j].getYear()) {
					car = cars[i];
					cars[i] = cars[j];
					cars[j] = car;
				}
			}

		}
		System.out.println("");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
