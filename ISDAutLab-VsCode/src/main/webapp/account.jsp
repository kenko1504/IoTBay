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
            User user = (User) session.getAttribute("user");
        %>

        <% if(user == null) { %>
            <h1>You have not registered, please fill in the form!</h1>
        <% } else { %>   
            <h1>Welcome to your Account.<h1> 
            <h1><%=user.getName()%></h1>
            <h1><%=user.getEmail()%></h1>
            <button><a href="/logout.jsp">Log out!</a></button>
        <% } %>
    </body>
</html>
