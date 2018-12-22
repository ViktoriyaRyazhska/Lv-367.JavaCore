/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import finaltasks.FinalTasks;
import static finaltasks.FinalTasks.br;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taras
 * Input number and decompose this number into a product of prime numbers with their degrees
        (e.g. number: 84, result 2^2, 3, 7)
 */
public class Task2 {

    int[] simpleNum = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149};

    public Task2(BufferedReader br) {
        int num = 0;
        System.out.println("Enter number");
        try {
            num = Integer.parseInt(br.readLine());

            System.out.println(decompose(num));
        } catch (NumberFormatException | NullPointerException e) {
            System.err.println("Enter correct number.");
        } catch (IOException ex) {
            Logger.getLogger(FinalTasks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private List<Integer> decompose(int num) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = 0; i < simpleNum.length; i++) {
                if (num % simpleNum[i] == 0) {
                    list.add(simpleNum[i]);
                    num = num / simpleNum[i];
                    break;
                }
            }
            if (num == 1) {
                break;
            }
        }
        return list;
    }
}
