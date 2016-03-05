<%-- 
    Document   : SignIn
    Created on : Mar 3, 2016, 3:00:40 PM
    Author     : KyleE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        ${error}
        <form action="SignIn" method="POST">
            User: <input type="text" name="user"><br>
            Pass: <input type="password" name="pass"><br>
            <button type="submit">Sign In</button>
        </form>
    </body>
</html>
