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
 * Input string and check if this string is palindrome (e.g. “ABCCBA”)
 */
public class Task5 {

    public Task5(BufferedReader br) {
        System.out.println("Enter word");
        String string = "";
        try {
            string = br.readLine();
            System.out.println("This word \"" + string + "\" is " + (polindrome(string) ? "a polindrom" : " not a polindrome"));
        } catch (IOException ex) {
            Logger.getLogger(Task5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean polindrome(String str) {
        boolean polindrome = false;
        char[] cs = str.toUpperCase().toCharArray();
        int i1 = 0;
        int i2 = cs.length - 1;
        while (i2 > i1) {
            if (cs[i1] != cs[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

}
