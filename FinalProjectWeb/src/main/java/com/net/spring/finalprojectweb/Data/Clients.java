/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb.Data;

import com.net.spring.finalprojectweb.Models.BankClient;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Taras
 */
public class Clients {

    private static List<BankClient> bankClients = new ArrayList<>();
    private static Clients instance = new Clients();

    private Clients() {
        bankClients.add(new BankClient("Pttro", "First", "Furta", "Lviv", "zar89@i.ua", "0312312312", new Date()));
        bankClients.add(new BankClient("Roman", "Second", "Lubinska", "Lviv", "Mar69@gmail.com", "0665465765", new Date()));
        bankClients.add(new BankClient("Igor", "Fifty", "Shevchenka", "Lviv", "bar89@i.ua", "0634308999", new Date()));
        bankClients.add(new BankClient("Violet", "OneMore", "Zelena", "Lviv", "bar89@i.ua", "0634308768", new Date()));
        bankClients.add(new BankClient("Olya", "Last", "Zelena", "Lviv", "bar89@i.ua", "0322910602", new Date()));
    }

    public List<BankClient> getBankClients() {
        return bankClients;
    }

    public void setNewBankClients(BankClient bankClient) {
        this.bankClients.add(bankClient);
    }

    public BankClient getBankClient(int id) {
        BankClient client = new BankClient();
        for (BankClient c : bankClients) {
            if (c.getId() == id) {
                client = c;
            }
        }
        return client;
    }

    public static Clients getInstance() {
        return instance;
    }

}
