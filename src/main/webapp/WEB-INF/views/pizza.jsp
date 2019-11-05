<%-- 
    Document   : pizza
    Created on : Sep 27, 2019, 5:46:40 PM
    Author     : emergency
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <tr>
                <td>Name</td>
                <td>Flavor</td>
                <td>Toppings</td>
            </tr>
            <tr>
                <td>${pizza.name}</td>
                <td>${pizza.flavor}</td>
                <td>
                    <c:forEach var="item" items="${pizza.toppings}">
                        <c:out value="${item}"/>&nbsp;
                    </c:forEach>
                </td>
                
            </tr>
            
        </table>
    </body>
</html>
