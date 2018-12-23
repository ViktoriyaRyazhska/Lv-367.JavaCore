/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.net.spring.finalprojectweb;

import com.net.spring.finalprojectweb.Data.Clients;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Taras
 */
public class FirstServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        Clients clients = new Clients();
        request.setAttribute("list", clients.getBankClients());
        request.getRequestDispatcher("BankClients.jsp").forward(request, response);
    }
}
