/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Taras
 * Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)
 */
public class Task1 {

    public Task1(BufferedReader br) {
        int num = 0;
        System.out.println("Enter number of Fibonacci sequence");
        try {
            num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                throw new NumberFormatException("Number must be more when zero");
            }
            System.out.println(Arrays.toString(fibonachi(num)));
        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Enter correct number.");
        } catch (IOException ex) {
            System.err.println("Some problen");
        }
    }

    private int[] fibonachi(int num) {
        int[] sequence = new int[num];
        if (num >= 2) {
            sequence[0] = 1;
            sequence[1] = 1;
            for (int i = 2; i < num; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        } else if (num == 1) {
            sequence[0] = 1;
        }
        return sequence;
    }
}
