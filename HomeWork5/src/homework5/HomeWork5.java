/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Taras
 */
public class HomeWork5 {

    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Excersixe №1");
        int[] dayInMounth = new int[]{31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        while (true) {
            try {
                System.out.print("Enter mounth number ");
                int mounth = Integer.valueOf(bufferedReader.readLine());
                if (mounth <= 12 && mounth > 0) {
                    System.out.println("This mounth has " + dayInMounth[mounth - 1]);
                    break;
                } else {
                    throw new NumberFormatException("Where is no such mounth");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (IOException ex) {
                System.out.println("Wrong!!!");
            }
        }

        System.out.println("___________________________________________________");
        System.out.println("Excersixe №2");
        int[] numbers = new int[]{5, -2, -6, 12, 54, -70, 40, -1, 0, 4};
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i < 5) {
                sum += numbers[i];
            } else if (sum > 0) {
                product *= numbers[i];
            }
        }
        System.out.println("Sum = " + sum + (sum < 0 ? "Product = " + product : ""));

        System.out.println("___________________________________________________");
        System.out.println("Excersixe №3");
        int i = 0;
        int count = 0;
        product = 1;
        numbers = new int[5];
        while (i < 5) {
            System.out.println("Enter " + (i + 1) + "number");
            count++;
            try {
                numbers[i] = Integer.valueOf(bufferedReader.readLine());
                product *=numbers[i];
                if (numbers[i] < 0) {
                    break;
                }
                i++;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Wrong!!!");
                continue;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Number was wentered " + count);
        System.out.println("Product of all entered numbers " + product );
        System.out.println("___________________________________________________");
        System.out.println("Excersixe №4");

        Car[] cars = new Car[4];
        cars[0] = new Car("BMW", 2007, 2.0f);
        cars[1] = new Car("WV", 1.3f);
        cars[1].setYearOfProduction(bufferedReader);
        cars[2] = new Car("SAAB", 2005, 1.6f);
        cars[3] = new Car("Audi", 3.2f);
        cars[3].setYearOfProduction(bufferedReader);

        int n = cars.length;
        for (i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
