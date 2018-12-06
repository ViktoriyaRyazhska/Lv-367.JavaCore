/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;

import homework6.exercise1.Bird;
import homework6.exercise1.Chicken;
import homework6.exercise1.Eagle;
import homework6.exercise1.Penguin;
import homework6.exercise1.Swallow;
import homework6.exercise2.ContractEmployee;
import homework6.exercise2.Employee;
import homework6.exercise2.FixedPaid;
import homework6.exercise2.PaidWorker;
import homework6.exercise2.Worker;
import java.util.Arrays;

/**
 *
 * @author Taras
 */
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exercixe №1");
        Bird[] birds = new Bird[]{
            new Eagle(false, "Broun", "Eagle"),
            new Swallow(true, "Bleak&White", "Swallow"),
            new Penguin(true, "Bleak&White", "Penguin"),
            new Chicken(true, "Like Chicken", "Chicken"),};

        for (Bird bird : birds) {
            System.out.println(bird.fly());
            System.out.println(bird.toString());
        }
        System.out.println("__________________________________________________");
        System.out.println("Exercixe №2");

        Worker[] employees = new Worker[]{new PaidWorker("1231239v01v41", "Petro", 15.4, 39),
            new PaidWorker("1gf23415116", "Ivan", 9.5, 46),
            new PaidWorker("123567658", "Orest", 45.25, 20),
            new FixedPaid("1234567890453", "Oly", 12000),
            new FixedPaid("3456789876543", "Rex", 54000),
            new FixedPaid("12787970", "Ease", 123400)};
        int n = employees.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (employees[j].calculatePay() > employees[j + 1].calculatePay()) {
                    Worker temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        for (Worker employee : employees) {
            System.out.println(employee.toString());
        }
    }

}
