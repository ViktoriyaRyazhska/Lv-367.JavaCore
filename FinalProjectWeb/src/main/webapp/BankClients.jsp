<%-- 
    Document   : BankClients
    Created on : 23.12.2018, 15:18:56
    Author     : Taras
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>id</td>
                <td>Client Name</td>
                <td>Address</td>
                <td>birthday</td>
                <td>Email</td>
                <td>Phone Number</td>
            </tr>
            <c:forEach var="client" items="${requestScope.list}">
                <tr><td>${client.id}</td>
                    <td>${client.firstName} ${client.secondName}</td>
                    <td>${client.city} Str. ${client.streat}</td>
                    <td>${client.birthDay}</td>
                    <td>${client.email}</td>
                    <td>${client.phoneNumber}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
