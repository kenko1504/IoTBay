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
        <h3>Home</h3>
        <div style ="margin-top: 12%"> <!--inline css; you can use the head version -->
            <h1 style="text-align: center; font-size: 50px">IoTBay</h1>
            <div style ="text-align: center;">
                <a href="/login.jsp">Login</a>
                </br>
                </br>
                <a href="/register.jsp">Register</a>
            </div>
        <div>
    </body>
</html>
