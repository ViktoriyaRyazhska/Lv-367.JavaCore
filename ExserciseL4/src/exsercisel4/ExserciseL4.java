/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsercisel4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taras
 */
public class ExserciseL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Type 3 float number");
//        float floats[] = new float[3];
//        for (int i = 0; i < floats.length; i++) {
//            System.out.print("Enter " + i + " number :");
//            try {
//                floats[i] = Float.parseFloat(br.readLine());
//            } catch (IOException ex) {
//                System.out.println("Error");
//                i--;
//            }
//        }
//        if ((floats[0] < 5 && floats[0] > -5) && (floats[1] < 5 && floats[1] > -5) && (floats[2] < 5 && floats[2] > -5)) {
//            System.out.println(" All nums in range [-5 , 5]");
//        } else {
//            System.out.println(" Nums not in range [-5 , 5]");
//        }
//        System.out.println("____________________________________________________");
//        System.out.println("Type 3 int number");
//        int ints[] = new int[3];
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print("Enter " + i + " number :");
//            try {
//                ints[i] = Integer.parseInt(br.readLine());
//            } catch (IOException ex) {
//                System.out.println("Error");
//                i--;
//            }
//        }
//        int min = ints[0];
//        int max = ints[0];
//        for (int i = 0; i < ints.length; i++) {
//            if (min > ints[i]) {
//                min = ints[i];
//            }
//            if (max < ints[i]) {
//                max = ints[i];
//            }
//            
//        }
//        System.out.println("Min value = " + min + "\r\nMax value = " + max);
//        System.out.println("____________________________________________________");
//        System.out.print("Enter Http Error ");
//        int error = 0;
//        boolean state = false;
//        while (true) {
//            try {
//                error = Integer.parseInt(br.readLine());
//
//                for (HTTPError s : HTTPError.values()) {
//                    if (error == s.getDescription()) {
//                        System.out.println(s + ": " + s.getDescription());
//                        state = true;
//                    }
//                }
//                if(state == false){
//                    System.out.println("Dont find error!");
//                }
//                break;
//            } catch (IOException e) {
//                System.out.println("Wrong");
//            }
//        }

        System.out.println("____________________________________________________");
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Vally", Bread.Mops, 12);
        dogs[1] = new Dog("Dolly", Bread.Akita, 7);
        dogs[2] = new Dog("Vally", Bread.Ariegeois, 1);
        if (dogs[0].equals(dogs[1]) || dogs[0].equals(dogs[2]) || dogs[1].equals(dogs[2])) {
            System.out.println("There are dogs this same name");
        }else{
            System.out.println("No dogs this same name");
        }

        Dog oldest = dogs[0];
        for (int i = 0; i < dogs.length; i++) {
            if (oldest.getAge() < dogs[i].getAge()) {
                oldest = dogs[i];
            }
        }
        System.out.println(oldest.toString());

    }

}
