/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb.Models;

/**
 *
 * @author Taras
 */
public enum AccountType {
    CurrentAccount("Current Account"), BudgetAccount("Budget Account"), CreditAccount("Credit Account"), DepositAccount("Deposit Account");

    private String description;

    private AccountType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static AccountType getAccountType(int index) {
        switch (index) {
            case 1:
                return CurrentAccount;
            case 2:
                return BudgetAccount;
            case 3:
                return CreditAccount;
            case 4:
                return DepositAccount;
        }
        return CurrentAccount;
    }
}
