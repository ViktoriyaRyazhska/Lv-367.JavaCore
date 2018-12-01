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
public class FixedPaid extends ContractEmployee {

    private double fixedMonthlyPayment;

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public FixedPaid(String federalTaxIdmember, String name, double fixedMonthlyPayment) {
        super(name);
        setEmployeeld(federalTaxIdmember);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " , Salary = " + calculatePay();
    }

}
