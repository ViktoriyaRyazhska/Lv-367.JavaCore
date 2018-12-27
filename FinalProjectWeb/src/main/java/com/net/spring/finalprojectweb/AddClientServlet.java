/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb;

import com.net.spring.finalprojectweb.Data.Clients;
import java.io.IOException;
import com.net.spring.finalprojectweb.Models.BankClient;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Taras
 */
@WebServlet(name = "AddClientServlet", urlPatterns = {"/AddClientServlet"})
public class AddClientServlet extends HttpServlet {

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String ser = request.getParameter("name");
//        BankClient bankClient = new BankClient(request.getParameter("name"), request.getParameter("secondName"), request.getParameter("Streat"), request.getParameter("City"), request.getParameter("Email"),
//                request.getParameter("phoneNumber"), new Date());//req.getParameter("Birthday")
//        Clients clients = Clients.getInstance();
//        System.out.println(bankClient.toString());
//        clients.setNewBankClients(bankClient);
//        request.getRequestDispatcher("/").forward(request, response);
//    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("addClient.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BankClient bankClient = new BankClient(request.getParameter("name"), request.getParameter("secondName"), request.getParameter("Streat"), request.getParameter("City"), request.getParameter("Email"),
                request.getParameter("phoneNumber"), new Date());//req.getParameter("Birthday")

        Clients clients = Clients.getInstance();
        clients.setNewBankClients(bankClient);

        request.setAttribute("clientName", bankClient.getFirstName() + "  " + bankClient.getSecondName());
        doGet(request, response);
    }

}
