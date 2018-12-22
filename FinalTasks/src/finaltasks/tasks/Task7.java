/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Taras
 * Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)s
 */
public class Task7 {

    public Task7(BufferedReader br) {
        System.out.println("Enter number");
        int num = 0;
        try {
            num = Integer.parseInt(br.readLine());
            if (num < 0) {
                throw new NumberFormatException("Number must be positive");
            }
            System.out.println(num + "! is " + calculateFactorial(num));
        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Wrong format of number");
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    private double calculateFactorial(int num) {
        double Factorial = 1;
        for(int i = 1; i <= num; i++){
            Factorial *= i;
        }
        return Factorial;
    }

}
