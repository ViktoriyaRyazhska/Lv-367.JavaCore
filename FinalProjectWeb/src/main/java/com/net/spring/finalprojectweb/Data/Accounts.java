/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb.Data;

import com.net.spring.finalprojectweb.Models.BankClient;
import com.net.spring.finalprojectweb.Models.ClientAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Taras
 */
public class Accounts {

    List<ClientAccount> clientAccounts = new ArrayList<>();

    public Accounts() {
        clientAccounts.add(new ClientAccount());
        clientAccounts.add(new ClientAccount());
        clientAccounts.add(new ClientAccount());
        clientAccounts.add(new ClientAccount());
        clientAccounts.add(new ClientAccount());
        clientAccounts.add(new ClientAccount());
    }

    public List<ClientAccount> getClientAccounts() {
        return clientAccounts;
    }

    public void setClientAccounts(ClientAccount clientAccount) {
        this.clientAccounts.add(clientAccount);
    }

    public List<ClientAccount> find(int clientId) {
        List<ClientAccount> results = new ArrayList<>();
        for (ClientAccount account : clientAccounts) {
            if (account.getClientID() == clientId) {
                results.add(account);
            }
        }
        return results;
    }
}
