<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@page import="uts.isd.model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body {
                background: url('feit.jpg') no-repeat center center; /*center center fixed; */
                /*
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;  
                */
                width: 200px;
                height: 200px;
                background-size: contain;
                border-radius: 50%;
                letter-spacing: 4px;
                font-family: Arial, Helvetica, sans-serif;
            }

            #bar {
                position: fixed;
                background-color: #134c5b;
                padding: 10px 5px 6px 15px;
                color: white;
                font-size: 30px;
                font-weight: bold;
                top: 0;
                left: 0;
                right: 0;
                opacity: 0.7;
            }

            #links {
                font-size: 18px;
                padding: 5px;
                word-spacing: 2px;
                float: right;
            }

            .footer {
                position: fixed;
                background-color: #134c5b;
                left: 0;
                right: 0;
                bottom: 0;
                font-size: 36px;
                color: #afeb00;
                padding: 3px;
                text-align: center;
                opacity: 0.7;
            }

            .message {
                color: #4caf50;
                font-weight: bold;
                font-size: 20px;
            }

            input {
                margin-bottom: 16px;
            }

        </style>
        <title>Login</title>
    </head>
    <body >
        <%
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String submitted = request.getParameter("submitted");
            String name = request.getParameter("name");

           
        %>
        <% if (submitted != null) { %>
            <h1>Welcome</h1>
            <h2>Email: <%= email%></h2>
            <h2>Name: <%= name%></h2>

        <% } else { %>
        <form>
            <label for="email">Email:</label>
            <input type="email" name="email" id="email" placeholder="email" required/>
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" placeholder="password" />
            <br/>
            <br/>
            <input type="hidden" name="submitted" id="submitted" value="true" />
            <button type="submit">Login!</button>
        </form>

        <button><a href="/">Return to Home Page.</a></button>
        <% } %>
    </body>
</html>
