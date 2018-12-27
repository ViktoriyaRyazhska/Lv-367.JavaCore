<%-- 
    Document   : addClient
    Created on : 25.12.2018, 17:05:03
    Author     : Taras
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <link href="css/style.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%
                if (request.getAttribute("clientName") != null) {
                    out.println("<h1>New Client '" + request.getAttribute("clientName") + "' added!</h1>");
                }
            %>
            <div>
                <h1>Add new bank client</h1>
            </div>
            <div>
                <form action="AddClientServlet" method="Post">
                    <table>
                        <tr>                
                            <td>Client Name</td>
                            <td><input type="text" name="name" required></td>
                        </tr>
                        <tr>
                            <td>Second Name</td>
                            <td><input type="text" name="secondName" required></td>
                        </tr>
                        <tr>
                            <td>Birthday</td>
                            <td><input type="date" name="Birthday" required></td>
                        </tr>
                        <tr>
                            <td>City</td>
                            <td><input type="text" name="City" required></td>
                        </tr>
                        <tr>
                            <td>Streat</td>
                            <td><input type="text" name="Streat" required></td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td><input type="email" name="Email"></td>
                        </tr>
                        <tr>
                            <td>Phone Number</td>
                            <td><input type="text" name="phoneNumber" required></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input class="pure-button" type="submit" value="Safe client"></td>
                        </tr>
                    </table>   
                </form>

            </div>
            <div class="pure-button-group" style=" text-align: center; left: 50%">
                <form action="/FinalProjectWeb/" method="get">
                    <input class="pure-button" type="submit" value="Back to main"/>
                </form>
            </div>
        </div>

    </body>
</html>
