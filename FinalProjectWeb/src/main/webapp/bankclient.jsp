<%-- 
    Document   : bankclient
    Created on : 25.12.2018, 16:46:12
    Author     : Taras
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank</title>

    </head>
    <body>
        <div class="container">
            <div style="left: 50%;">
                <h1>List of bank client</h1>
            </div>
            <table>
                <tr>
                    <td>Id</td>
                    <td>Client name</td>
                    <td>Address</td>
                    <td>Birthday</td>
                    <td>Email</td>
                    <td>Phone number</td>
                    <td>Info</td>
                </tr>
                <c:forEach var="client" items="${requestScope.clientList}">              
                    <tr>
                        <td>${client.id}</td>
                        <td>${client.firstName} ${client.secondName}</td>
                        <td>${client.city} Str. ${client.streat}</td>
                        <td>${client.birthDay}</td>
                        <td>${client.email}</td>
                        <td>${client.phoneNumber}</td>
                        <td><a href="<c:url value="accounts">
                                   <c:param name="clientId" value="${client.id}"/>
                               </c:url>">Accounts</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <div class="pure-button-group" style=" text-align: center; left: 50%">
                <form action="addClient.jsp" method="get">
                    <input class="pure-button" type="submit" value="Add new client"/>
                </form>
            </div>
        </div>
    </body>
</html>
