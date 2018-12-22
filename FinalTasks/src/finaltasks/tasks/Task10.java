/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Taras
 * Find the number of steps for which you get 1, using the following process: we take any 
 * the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then 
 * multiply by 3 and add 1
 */
public class Task10 {

    public Task10(BufferedReader br) {
        System.out.println("Enter number");
        int num = 0;
        while (true) {
            try {
                num = Integer.parseInt(br.readLine());
                if (num < 1) {
                    throw new NumberFormatException("Number must be positive and bigger then 1");
                }
                break;
            } catch (NumberFormatException | NullPointerException e) {
                System.err.println("Wrong format of number");
            } catch (IOException e) {
                System.err.println("Error");
            }
        }

        System.out.println("It's took " + method(num) + " to get 1");
    }

    private int method(int num) {
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            count++;
        }
        return count;
                
    }

}
