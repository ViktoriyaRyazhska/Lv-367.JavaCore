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
 * Input cost of dollar and sum of money in gryvna. Calculate how many dollars user can buy and change.
 */
public class Task3 {

    public Task3(BufferedReader br) {
        double dollarCost = 0;
        double gryvna = 0;

        System.out.println("Enter Dollar cost");
        while (true) {
            try {
                dollarCost = Double.valueOf(br.readLine());
                break;
            } catch (NumberFormatException | NullPointerException e) {
                System.err.println("Wrong number format.");
            } catch (IOException ex) {
                System.err.println("Error");
            }
        }
        System.out.println("Enter amoun of grivna");
        while (true) {
            try {
                gryvna = Double.valueOf(br.readLine());
                break;
            } catch (NumberFormatException | NullPointerException e) {
                System.err.println("Wrong number format.");
            } catch (IOException ex) {
                System.err.println("Error");
            }
        }
        System.out.printf("User can buy %.2f dollars", (gryvna / dollarCost));
    }

}
