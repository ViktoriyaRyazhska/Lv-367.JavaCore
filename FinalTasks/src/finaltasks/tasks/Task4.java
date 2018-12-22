/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taras
 * Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)
 */
public class Task4 {

    public Task4(BufferedReader br) {
        System.out.println("Enter String");
        try {
            String string = br.readLine();
            System.out.println("In string are " + calculateLaudLetter(string) + " letters");
        } catch (IOException ex) {
            Logger.getLogger(Task4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    char[] laudLetter = new char[]{'a', 'e', 'y', 'u', 'i', 'o'};

    private int calculateLaudLetter(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char c : chars) {
            for (int j = 0; j < laudLetter.length; j++) {
                if (c == laudLetter[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
