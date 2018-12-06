/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Taras
 */
public class Homework8 {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder builder;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Excercise №1");
        System.out.println("Write sentence.");
        try {
            builder = new StringBuilder(bufferedReader.readLine());

            String[] str = builder.toString().split(" ");
            System.out.println(Arrays.toString(str));
            int allLeang = 0;
            String max = str[0];
            for (int i = 0; i < str.length; i++) {
                allLeang += str[i].length();
                if (i == 1) {
                    System.out.println(new StringBuilder(str[i]).reverse());
                }
                if (max.length() < str[i].length()) {
                    max = str[i];
                }
            }
            System.out.println("Number of letters = " + allLeang);
            System.out.println("Longest word \"" + max + "\"");
        } catch (IOException e) {
            System.out.println("Same error");
        }
        System.out.println("Excercise №2");

        String str2 = "I  am  learning    Java   Core";
        String[] strings = str2.split(" ");
        builder = new StringBuilder("");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 0) {
                builder.append(strings[i]).append(" ");
            }
        }
        System.out.println(builder.toString().replaceAll("I am", "I'm"));
        System.out.println("Excercise №3");

        Pattern p = Pattern.compile("^\\$(\\d+)(\\.\\d{2})+");
        System.out.println("Enter US currency.");
        try {
            str2 = bufferedReader.readLine();
        } catch (Exception e) {
            System.err.println("Error.");
        }
        Matcher m = p.matcher(str2);
        System.out.println(m.matches() ? "yes" : "No");
        m.reset();
        while (m.find()) {
            System.out.println(str2.substring(m.start(), m.end()));
        }

    }
}
