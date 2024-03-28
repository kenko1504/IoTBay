<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@page import="uts.isd.model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" href="css/layout.css">-->
        <script type="text/javascript" src="js/index.js"></script>
        <title>Home Page</title>
    </head>
    <body>
    <%
        User user = (User)session.getAttribute("user");
    %>
    <% if (user == null){ %>
                <h2>You need to login/register first</h2>
                <a href="/index.jsp">Back</a>
        <% } else {%>

        <h3>Main</h3>
        <p>Account: <%= user.getEmail()%></p>
        <div style ="margin-top: 12%"> <!--inline css; you can use the head version -->
            <h1 style="text-align: center; font-size: 50px">IoTBay</h1>
            <div style ="text-align: center;">
                <a href="">Devices management (to be implemented)</a>
                </br>
                </br>
                <a href="/logout.jsp">Logout</a>
            </div>
        <div>
        <% } %>
    </body>
</html>
