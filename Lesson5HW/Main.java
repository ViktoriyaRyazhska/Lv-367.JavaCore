package homeworkl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Write number of month ");
		try {
			MonthDay.checkmonth(Integer.parseInt(br.readLine()));
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calculation.numbers();

		try {
			Position.numbers();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Car[] cars = new Car[3];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
			System.out.println("Write type of car ");
			try {
				cars[i].setType(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Write yerar of production ");
			try {
				cars[i].setYear(Integer.parseInt(br.readLine()));
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Write engine capacity");
			try {
				cars[i].setCapacity(Double.parseDouble(br.readLine()));
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Write certain model year");
		int year = 0;
		try {
			year = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
