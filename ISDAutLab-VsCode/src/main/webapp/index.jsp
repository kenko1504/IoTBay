<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" href="css/layout.css">-->
        <script type="text/javascript" src="js/index.js"></script>
        <title>Home Page</title>
    </head>
    <body onload="startTime()" >
        <%
            String email = request.getParameter("email");
            String name = request.getParameter("password");
        %>
        <h1>Home Page</h1>
        <h1>Welcome to Group 3 Home Page!</h1>
        <form>
        <label for="email">Email:</label>
            <input type="email" name="email" id="email" placeholder="email" required/>
        <label for="password">Password:</label>
            <input type="password" name="password" id="password" placeholder="password" /> 
            <br/>
            <input type="hidden" name="submitted" id="submitted" value="true" />
            <button type="submit">Click Here to Login.</button>
        </form>
        <a href="/register.jsp">Click Here & Register an Account With Us!</a>
    </body>
</html>
