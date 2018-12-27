<%-- 
    Document   : addAccount
    Created on : 26.12.2018, 17:41:08
    Author     : Taras
--%>

<%@page import="com.net.spring.finalprojectweb.Models.AccountType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link href="css/style.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add account</title>
    </head>
    <body>
        <div class="container">
            <div>
                <%
                    if (request.getAttribute("clientName") != null) {
                        out.println("<h1>Add new Account to " + request.getAttribute("clientName") + ".</h1>");
                    }
                %>
            </div>
            <div>
                <form action="AddAccount" method="Post">
                    <table>
                        <tr>
                            <td>Account type</td>
                            <td>
                                <select class="new-select" name="accountType">
                                    <option value="1">${AccountType.BudgetAccount}</option>
                                    <option value="2">${AccountType.CreditAccount}</option>
                                    <option value="3">${AccountType.CurrentAccount}</option>
                                    <option value="4">${AccountType.DepositAccount}</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>First deposit</td>
                            <td><input class="new-select" type="number"  name="deposite" required></td>
                        </tr>
                        <tr>
                            <td>Credit is allowed</td>
                            <td>
                                <input class="new-select" style="left: -100px" type="checkbox" name="creaditAlloud" value="ON" />
                            </td>
                        </tr>
                        <tr>
                            <td>Creadit limit</td>
                            <td><select class="new-select" name="creditLimit">
                                    <option value="700">700</option>
                                    <option value="2000">2000</option>
                                    <option value="5000">5000</option>
                                    <option value="10000">10000</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input class="pure-button" type="submit" value="Add account"></td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="pure-button-group" style=" text-align: center; left: 50%">
                <form action="accounts" method="get">
                    <input class="pure-button" type="submit" value="Back to accounts"/>
                </form>
            </div>
        </div>
    </body>
</html>
