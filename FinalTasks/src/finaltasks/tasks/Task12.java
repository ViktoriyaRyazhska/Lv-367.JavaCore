/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Taras
 */
/*
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The
        sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Task12 {

    public Task12(int num) {
        List<Integer> integers = new ArrayList<>();
        int sum = 0;
        for (int i = 1;; i++) {
            if (num > 5 * i) {
                integers.add(5 * i);
            } else {
                break;
            }
        }
        for (int i = 1;; i++) {
            if (num > 3 * i) {
                integers.add(3 * i);
            } else {
                break;
            }
        }
        for (Integer i : integers) {
            sum += i;
        }
        System.out.println(sum);
    }

}
