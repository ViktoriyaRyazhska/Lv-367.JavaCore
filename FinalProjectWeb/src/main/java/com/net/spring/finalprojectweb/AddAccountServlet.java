/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb;

import com.net.spring.finalprojectweb.Data.Accounts;
import com.net.spring.finalprojectweb.Data.Clients;
import com.net.spring.finalprojectweb.Models.AccountType;
import com.net.spring.finalprojectweb.Models.BankClient;
import com.net.spring.finalprojectweb.Models.ClientAccount;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Taras
 */
public class AddAccountServlet extends HttpServlet {

    private BankClient bankClient;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (bankClient == null) {
            bankClient = Clients.getInstance().getBankClient(Integer.parseInt(request.getParameter("clientId")));
        }
        request.setAttribute("clientName", bankClient.getFirstName() + "  " + bankClient.getSecondName());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("addAccount.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int t = Integer.parseInt(request.getParameter("accountType"));
        double creaditLimit = 0;
        if (request.getParameter("creaditAlloud").equals("ON")) {
            creaditLimit = Double.valueOf(request.getParameter("creditLimit"));
        }
        ClientAccount account = new ClientAccount(bankClient.getId(), Double.parseDouble(request.getParameter("deposite")),
                AccountType.getAccountType(Integer.parseInt(request.getParameter("accountType"))), creaditLimit);
        Accounts accounts = Accounts.getInstance();
        accounts.setClientAccounts(account);
        doGet(request, response);
    }

}
