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
 * Input text and calculate number of words in this text
 */
public class Task6 {

    public Task6(BufferedReader br) {
        System.out.println("Input text");
        int count = 0;
        String string = "";
        try {
            string = br.readLine();
            count += string.split(" ").length;
        } catch (IOException e) {
            System.err.println("We have a problem");
        }

        System.out.println("Input text has " + count + " words");
    }

}
