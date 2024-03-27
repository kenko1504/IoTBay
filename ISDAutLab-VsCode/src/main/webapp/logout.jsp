<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account</title>
    </head>
    <body>
        <%
        session.invalidate();
        %>
        <h1> You have been Logged Out!</h1>
        <button><a href="/">Home Page</a></button>
    </body>
</html>
