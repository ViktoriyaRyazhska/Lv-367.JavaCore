/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Taras
 */
public class ExerciseL1 {

    /**
     * @param args the command line arguments
     */
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        exercise3();
    }

    public static void exercise1() {
        System.out.print("Flower bed is shaped like a circle. Entering the radius : ");
        while (true) {
            try {
                int i = Integer.parseInt(br.readLine());
                System.out.print("Bed perimeter  = " + String.format("%f%n", (2 * Math.PI * i)));

                System.out.print("Bed area   = " + String.format("%f%n", (Math.PI * i * i)));
                break;
            } catch (NumberFormatException | IOException ex) {
                System.err.println("Invalid Format! Try again :)");
            }
        }
    }

    public static void exercise2() {
        System.out.println("What is your name?");
        String name, address;
        try {
            name = br.readLine();
            System.out.println("Where are you live, " + name + "?");
            address = br.readLine();
            System.out.println(name + " you are living at " + address);
        } catch (IOException ex) {
            System.err.println("Invalid Format! Try again :)");
        }
    }

    private static void exercise3() {
        System.out.println("Enter phone colls price");
        int[] prices = new int[3];
        int[] callLenght = new int[3];
        for (int i = 0; i < prices.length; i++) {
            try {
                System.out.print("Units per minute in c" + (i + 1) + " cost ");
                prices[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException | IOException ex) {
                System.err.println("Invalid Format! Try again :)");
                i--;
            }
        }

        for (int i = 0; i < callLenght.length; i++) {
            try {
                System.out.print("Conversation cost t" + (i + 1) + " continued ");
                callLenght[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException | IOException ex) {
                System.err.println("Invalid Format! Try again :)");
                i--;
            }
        }

        int together = 0;
        for (int i = 0; i < callLenght.length; i++) {
            together = prices[i] * callLenght[i];
            System.out.println((i + 1) + " conversation cost " + (prices[i] * callLenght[i]));
        }
        System.out.println("All conversation cost " + together);

    }
}
