<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            //retrieves post request from register.jsp/login.jsp form and stores them in email/password variable below
            String email = request.getParameter("email");
            String password = request.getParameter("password");
        %>
        <h1>Welcome</h1>
        <h2>Email: <%= email%></h2>
        <h2>You have succesfully created an account! You will now be directed to the main page.</h2>
        <button><a href="main.jsp">Proceed</button>

        <%
            User user = new User(email, password);
            session.setAttribute("user", user);
        %>
    </body>
</html>
