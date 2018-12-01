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
public abstract class SalariedEmployee extends Employee implements Worker {

    private String socialSecurityNumber;
    private static int SalariedEmployeeC = 0;
    private int SalariedEmployeeID;
    private String name;

    public SalariedEmployee(String name) {
        SalariedEmployeeC++;
        SalariedEmployeeID = SalariedEmployeeC;
        this.name = name;
    }

    public static int getSalariedEmployee() {
        return SalariedEmployeeC;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{ID = " + SalariedEmployeeID + ", SocialSecurityNumber = " + getEmployeeld() + ", name = " + name;
    }
}
