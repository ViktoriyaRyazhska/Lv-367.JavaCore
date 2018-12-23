/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb.Models;

import java.util.Date;

/**
 *
 * @author Taras
 */
public class Transaction {

    private static int transactionNumber = 0;
    private int id;
    private int acountID;
    private Date timeOfTransaction;
    private double amount;
    private double balsnce;
    private String note;

    public Transaction(int acountID, Date timeOfTransaction, double amount, double balsnce, String note) {
        transactionNumber++;
        this.id = transactionNumber;
        this.acountID = acountID;
        this.timeOfTransaction = timeOfTransaction;
        this.amount = amount;
        this.balsnce = balsnce;
        this.note = note;
    }

    public static int getTransactionNumber() {
        return transactionNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimeOfTransaction() {
        return timeOfTransaction;
    }

    public void setTimeOfTransaction(Date timeOfTransaction) {
        this.timeOfTransaction = timeOfTransaction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalsnce() {
        return balsnce;
    }

    public void setBalsnce(double balsnce) {
        this.balsnce = balsnce;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getAcountID() {
        return acountID;
    }

    public void setAcountID(int acountID) {
        this.acountID = acountID;
    }

}
