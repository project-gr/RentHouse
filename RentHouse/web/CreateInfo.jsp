<%-- 
    Document   : CreateInfo
    Created on : Dec 10, 2020, 12:34:21 PM
    Author     : Ren
--%>

<%@page import="com.renthouse.dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Information Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="cssInfor.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    </head>
    <body>



        <div class="container">
            <div class="forms-container">
                <div class="infor">
                    <form action="InfoControl" class="infor-form"> <%-- Information Control --%>
                        <h2 class="title">Your Profile</h2>

                        <%
                            String username = (String) request.getAttribute("username");
                            UserDAO userDAO = new UserDAO();
                            String ID = userDAO.getID(username);
                            if (ID == null) {
                        %>
                        <input type="hidden" value="<%= username%>" name="username">

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="ID" name="ID" required>
                        </div>
                        <%
                            } else {
                        %>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <h3 class="title"> Identification Card: <%= ID%> </h3>
                        </div>
                        <%
                            }
                        %>

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Full Name" name="fname" required>
                        </div>

                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="email" placeholder="Email" name="email" required>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Phone Number" name="phone" required>
                        </div>
                        <br>
                        <input type="submit" value="Save" class="btn solid">
                    </form>
                </div>
            </div>
            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>One of us?</h3>
                        <p>
                            If you have an account,
                            please press this button to Sign in!
                        </p>
                        <button class="btn transparent" onclick="location.href = 'SignIn.jsp'">Sign in</button>
                    </div>

                    <img src="infor.svg" class="image" alt="">
                </div>
            </div>
        </div>
    </body>
</html>
