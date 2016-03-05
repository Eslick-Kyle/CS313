<%-- 
    Document   : Post
    Created on : Mar 5, 2016, 11:27:00 AM
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
        <h1>New Post</h1>
        <form action="Post" method="POST">
            <textarea name="post"></textarea><br>
            <button type="submit" value="submit">Submit</button>
        </form>
    </body>
</html>
