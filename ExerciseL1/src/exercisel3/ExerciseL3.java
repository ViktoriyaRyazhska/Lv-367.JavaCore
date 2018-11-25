/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisel3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Taras
 */
public class ExerciseL3 {

    /**
     * @param args the command line arguments
     */
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Person p1 = new Person("Petro", 1989);
        p1.inputInfo(br);
        System.out.println(p1);
        System.out.println(p1.getInfo());
        Person p2 = new Person("Petro", 1978);
        System.out.println(p2);
        Person p3 = new Person("Petro", 1956);
        System.out.println(p3);
        Person p4 = new Person("Petro", 1921);
        System.out.println(p4);
        Person p5 = new Person("Petro", 2001);
        System.out.println(p5);
    }

}
