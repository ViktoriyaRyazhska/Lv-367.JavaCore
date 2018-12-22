/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Taras
 * Enter the credit card number from the manufacturer (Visa, MasterCard, American Express,
 * Discover) and check for the correct number (see how credit cards use the checksum)
 */
public class Task11 {

    public Task11(BufferedReader br) {
        System.out.println("Enter credit cart number in format xxxx-xxxx-xxxx-xxxx");
        String creditNumber = "";
        /*
                Matches major credit cards including: Visa (length 16, prefix 4),
                                                      Mastercard (length 16, prefix 51-55), 
                                                      Discover (length 16, prefix 6011), 
                                                      American Express (length 15, prefix 34 or 37). 
                All 16 digit formats accept optional hyphens (-) between each group of four digits.
         */
        String creditCartPattern = "^((4\\d{3})|(5[1-5]\\d{2})|(6011))-?\\d{4}-?\\d{4}-?\\d{4}|3[4,7]\\d{13}$";
        while (true) {
            try {
                creditNumber = br.readLine();
                Pattern p = Pattern.compile(creditCartPattern);
                Matcher matcher = p.matcher(creditNumber);
                if (!matcher.find()) {
                    throw new NumberFormatException("Cart number incorrect");
                }
                break;
            } catch (NumberFormatException | NullPointerException e) {
                System.err.println("Wrong format of number");
            } catch (IOException e) {
                System.err.println("Error");
            }
        }

        System.out.println("Entered credit cart number are " + (isValid("5457-6238-9823-4113") ? "correct" : "incorrect"));
    }

    private boolean isValid(String creditNumber) {
        boolean state = false;
        int sum = 0;
        creditNumber = creditNumber.replaceAll("-", "");

        if (creditNumber.length() != 16) {
            return false;
        } else {
            sum = oddSum(creditNumber) + digitSum(creditNumber);
            return (sum % 10 == 0 ? true : false);
        }
    }

    private int oddSum(String creditNumber) {
        int sum = 0;
        char[] chars = creditNumber.toCharArray();
        for (int i = 0; i < chars.length; i += 2) {
            int oddpart = Integer.parseInt(chars[i] + "") * 2;
            sum += oddpart >= 10 ? (oddpart / 10 + oddpart % 10) : oddpart;
        }
        return sum;
    }

    private int digitSum(String creditNumber) {
        int sum = 0;
        char[] chars = creditNumber.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            sum += Integer.parseInt(chars[i] + "");
        }
        return sum;
    }

}
