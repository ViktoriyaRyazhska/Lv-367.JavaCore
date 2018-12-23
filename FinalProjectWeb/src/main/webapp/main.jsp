<%-- 
    Document   : main
    Created on : 13.12.2018, 13:17:58
    Author     : Taras
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table><tr>
            <c:forEach var="client" items="${requestScope.list}">
                <td>${client.firstName}</td>
                <td>${client.secondName}</td>
            </c:forEach></tr>
        </table>
    </body>
</html>
