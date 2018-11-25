/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisel3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taras
 */
public class Person {

    private String name;
    private int birthYear;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    /*
            Output info about person
     */
    @Override
    public String toString() {
        return "Person name = " + name + ", Age = " + getAge() + ";\r\n";
    }

    void inputInfo(BufferedReader br) {
        System.out.println("Enter info about " + this.name);
        try {
            info = br.readLine();
        } catch (IOException ex) {
            System.out.println("Some error");
        }
    }

    public String getInfo() {
        return info;
    }
}
