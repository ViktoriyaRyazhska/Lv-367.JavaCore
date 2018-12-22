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
 * Write method to return random value 0 or 1. Input number n, call this method n times and
 * calculate how many times were number one
 */
public class Task9 {

    public Task9(BufferedReader br) {
        System.out.println("Enter how many times to call method");
        int num = 0;
        try {
            num = Integer.parseInt(br.readLine());
            if (num < 0) {
                throw new NumberFormatException("Number must be positive");
            }
            System.out.println("After call methow " + num + " there was " + calc(num) + " times 1");
        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Wrong format of number");
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public int random() {
        return new Random().nextInt(2);
    }

    private int calc(int num) {
        int i = 0;
        int count = 0;
        while (i < num) {
            if (random() == 1) {
                count++;
            }
            i++;
        }
        return count;
    }

}
