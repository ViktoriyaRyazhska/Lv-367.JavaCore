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
public abstract class ContractEmployee extends Employee implements Worker {

    private String federalTaxIdmember;
    private static int ContractEmployeeC = 0;
    private int ContractEmployeeID;
    private String name;

    public ContractEmployee(String name) {
        this.name = name;
        ++ContractEmployeeC;
        ContractEmployeeID = ContractEmployeeC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContractEmployeeC() {
        return ContractEmployeeID;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{ID = " + getContractEmployeeC() + ", federalTaxIdmember = " + getEmployeeld() + ", name = " + name;
    }

}
