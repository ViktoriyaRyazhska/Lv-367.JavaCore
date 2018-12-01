/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6.exercise2;

/**
 *
 * @author Taras
 */
public class PaidWorker extends SalariedEmployee {

    private double hourlyRate;
    private int numberOfHours;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public PaidWorker(String socialSecurityNumber, String name, double hourlyRate, int numberOfHours) {
        super(name);
        setEmployeeld(socialSecurityNumber);
        this.hourlyRate= hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary = " + calculatePay();
    }
    
}
