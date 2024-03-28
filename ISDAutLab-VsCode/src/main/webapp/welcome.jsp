<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            //retrieves post request from register.jsp form and stores them in email variable below
            String email = request.getParameter("email");
        %>
        <h1>Welcome</h1>
        <h2>Email: <%= email%></h2>
        <h2>You have succesfully created an account! Please login with your registered details.</h2>
        <button><a href="index.jsp">Home page</button>
    
    </body>
</html>
