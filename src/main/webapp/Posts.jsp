<%-- 
    Document   : Posts
    Created on : Mar 3, 2016, 3:25:18 PM
    Author     : KyleE
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String login = (String)request.getSession().getAttribute("isloggedin");
    if (login == null || !login.equals("true")){
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", "SignIn.jsp"); 
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach var="post" items="${posts}">
            ${post.user}: ${post.post}<br><br>
        </c:forEach>
    </body>
</html>
