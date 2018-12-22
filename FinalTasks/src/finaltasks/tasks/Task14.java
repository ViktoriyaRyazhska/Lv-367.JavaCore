/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltasks.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Taras
 */
/*
        In England the currency is made up of pound, £, and pence, p, and there are eight coins in
        general circulation: 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p). It is possible to make £2
        in the following way: 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p. How many different ways can
        £2 be made using any number of coins?
 */
public class Task14 {

    public Task14(int sum) {
        int ways = 0;
        for (int a = sum; a >= 0; a -= sum) {
            for (int b = a; b >= 0; b -= Coins.Pound.getDescription()) {
                for (int c = b; c >= 0; c -= Coins.FiftyPence.getDescription()) {
                    for (int d = c; d >= 0; d -= Coins.TwentyPence.getDescription()) {
                        for (int e = d; e >= 0; e -= Coins.TenPence.getDescription()) {
                            for (int f = e; f >= 0; f -= Coins.FivePence.getDescription()) {
                                for (int g = f; g >= 0; g -= Coins.TwoPence.getDescription()) {
                                    ways++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("£ %.2f can be generated in "+ways+" number of ways",((double)sum/100));

    }

    enum Coins {
        Pound(100),
        OnePence(1),
        TwoPence(2),
        FivePence(5),
        TenPence(10),
        TwentyPence(20),
        FiftyPence(50);

        private int description;

        private Coins(int description) {
            this.description = description;
        }

        public int getDescription() {
            return description;
        }
    }
}
