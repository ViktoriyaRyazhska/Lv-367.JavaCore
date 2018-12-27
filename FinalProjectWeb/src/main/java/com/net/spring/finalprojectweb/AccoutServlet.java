/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb;

import com.net.spring.finalprojectweb.Data.Accounts;
import com.net.spring.finalprojectweb.Data.Clients;
import com.net.spring.finalprojectweb.Models.BankClient;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Taras
 */
public class AccoutServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str = request.getParameter("clientId");
        BankClient bankClient = Clients.getInstance().getBankClient(Integer.parseInt(str));
        request.setAttribute("clientName", bankClient.getFirstName() + "  " + bankClient.getSecondName());
        request.setAttribute("clientId", bankClient.getId());
        
        Accounts accounts = Accounts.getInstance();
        List list = accounts.find(Integer.parseInt(str));
        request.setAttribute("accountList", list);// accounts.find(Integer.parseInt(str)));
        request.getRequestDispatcher("accounts.jsp").forward(request, response);
    }
// <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/FinalProjectWeb/accounts.jsp?id=${client.id}'">Accounts</button>

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

}
