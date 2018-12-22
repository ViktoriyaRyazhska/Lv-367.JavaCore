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
 * Input number in range from 1 to 1 000 000 and output this number in English
 */
public class Task8 {

    String[] digit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
        "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public Task8(BufferedReader br) {
        System.out.println("Enter number in range 1..1000000");
        int num = 0;
        while (true) {
            try {
                num = Integer.parseInt(br.readLine());
                if (num < 1 || num > 1000000) {
                    throw new NumberFormatException("Number must be positive");
                }
                break;
            } catch (NumberFormatException | NullPointerException e) {
                System.err.println("Wrong format of number");
            } catch (IOException e) {
                System.err.println("Error");
            }
        }
        System.out.println(num + " in English is " + numToString(num));
    }

    private String numToString(int num) {
        StringBuilder builder = new StringBuilder();
        if (num > 1000) {
            if (num / 100000 != 0) {
                builder.append(digit[(num / 100000) - 1]).append(" hundred ");
                num = num - num / 100000 * 100000;
            }
            if (num / 1000 < 19) {
                builder.append(digit[num / 1000]).append("");
            } else {
                if (num / 10000 != 0) {
                    builder.append(tens[(num / 10000) - 2]).append(" ");
                    num = num - num / 10000 * 10000;
                }
                if (num / 1000 != 0) {
                    builder.append(digit[(num / 1000) - 1]).append("");
                    num = num - num / 1000 * 1000;
                }
            }
            builder.append(" thousand ");
            if (num / 100 != 0) {
                builder.append(digit[(num / 100) - 1]).append(" hundred ");
                num = num - num / 100 * 100;
            }
            if (num < 19) {
                builder.append(digit[num - 1]).append(" ");
            } else {
                if (num / 10 != 0) {
                    builder.append(tens[(num / 10) - 2]).append(" ");
                    num = num - num / 10 * 10;
                }
                if (num != 0) {
                    builder.append(digit[(num) - 1]).append(" ");
                }
            }
        }
        return builder.toString();
    }

}
