<%-- 
    Document   : accounts
    Created on : 26.12.2018, 9:48:48
    Author     : Taras
--%>

<%@page import="com.net.spring.finalprojectweb.Models.ClientAccount"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accounts</title>
    </head>
    <body>
        <div class="container">
            <div>
                <%
                    if (request.getAttribute("clientName") != null) {
                        out.println("<h1>Client " + request.getAttribute("clientName") + " account list.</h1>");
                    }
                %>
            </div>
            <table class="">
                <tr>
                    <td>Account number</td>
                    <td>Client</td>
                    <td>Account type</td>
                    <td>Balance</td>
                    <td>Creadit Line</td>
                    <td>Transactions</td>
                </tr> 

                <c:forEach var="account" items="${requestScope.accountList}">              
                    <tr>
                        <td>${account.id}</td>
                        <td>${requestScope.clientName}</td>
                        <td>${account.accountType}</td>
                        <td>${account.balance}</td>
                        <td>${account.creaditLine}</td>
                        <td><a href="<c:url value="transaction">
                                   <c:param name="accountId" value="${account.id}"/>
                               </c:url>">Transaction</a></td>
                    </tr>
                </c:forEach>
            </table>
            <div class="pure-button-group" style=" text-align: center; left: 50%">
                <form action="AddAccount" method="get">
                    <input type="hidden" name="clientId" value="${requestScope.clientId}">
                    <input class="pure-button" type="submit" value="Add new account"/>
                </form>
                <form action="/FinalProjectWeb/" method="get">
                    <input class="pure-button" type="submit" value="To all client"/>
                </form>
            </div>
        </div>
    </body>
</html>
