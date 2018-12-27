/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb.Data;

import com.net.spring.finalprojectweb.Models.AccountType;
import com.net.spring.finalprojectweb.Models.BankClient;
import com.net.spring.finalprojectweb.Models.ClientAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Taras
 */
public class Accounts {

    private static List<ClientAccount> clientAccounts = new ArrayList<>();
    private static Accounts instance = new Accounts();

    private Accounts() {
        clientAccounts.add(new ClientAccount(1, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(4, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(3, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(2, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(2, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(1, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(5, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(1, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(1, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(3, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(5, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(3, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(4, 10000, AccountType.CurrentAccount, 0));
        clientAccounts.add(new ClientAccount(2, 10000, AccountType.CurrentAccount, 0));
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

    public List<ClientAccount> getAllAccounts() {
        return clientAccounts;
    }

    public static Accounts getInstance() {
        return instance;
    }
}
