/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Taras
 */
public class Car {

    private String type;
    private int yearOfProduction;
    private float engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car(String type, float engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    public Car(String type, int yearOfProduction, float engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    void setYearOfProduction(BufferedReader bufferedReader) {
        System.out.println("Enter year for " + this.toString());
        while (true) {
            try {
                this.yearOfProduction = Integer.valueOf(bufferedReader.readLine());
                break;
            } catch (IOException ex) {
                System.out.println("WRONG!!!");
            }
        }
    }

    @Override
    public String toString() {
        return "Car " + type + ", engineCapacity=" + engineCapacity + (yearOfProduction != 0 ? ", year of product " + yearOfProduction : "");
    }

    public Car() {
    }

}
