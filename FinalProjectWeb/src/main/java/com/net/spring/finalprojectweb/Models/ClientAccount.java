/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb.Models;

import java.util.Random;

/**
 *
 * @author Taras
 */

/*
идентификатор, идентификатор владельца, количество денег
 */
public class ClientAccount {

    private int id;
    private int clientID;
    private double balance;
    private AccountType accountType;
    private double creaditLine;
    private static int index = 0;

    public ClientAccount(int clientID, double balance, AccountType accountType, double creaditLine) {
        index++;
        this.id = index;
        this.clientID = clientID;
        this.balance = balance;
        this.accountType = accountType;
        this.creaditLine = creaditLine;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getCreaditLine() {
        return creaditLine;
    }

    public void setCreaditLine(double creaditLine) {
        this.creaditLine = creaditLine;
    }

}
