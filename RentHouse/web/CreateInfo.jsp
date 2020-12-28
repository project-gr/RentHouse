<%-- 
    Document   : CreateInfo
    Created on : Dec 10, 2020, 12:34:21 PM
    Author     : Ren
--%>

<%@page import="com.renthouse.bean.Student"%>
<%@page import="com.renthouse.bean.Users"%>
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
                    <form action="InfoControl" class="infor-form" method="post"> <%-- Information Control --%>
                        <h2 class="title">Your Profile</h2>

                        <%
                            Users user = (Users) session.getAttribute("user");

                            if (user == null) {
                                response.sendRedirect("SignIn.jsp");
                            }

                            UserDAO userDAO = new UserDAO();

                            String ID = null;
                            if (user.getUsertype().equals("Student")) {
                                ID = userDAO.getStudentID(user.getUsername());
                            } else if (user.getUsertype().equals("Landlord")) {
                                ID = userDAO.getLandlordID(user.getUsername());
                            } else {
                                ID = userDAO.getStaffID(user.getUsername());
                            }

                            if (ID == null) {
                        %>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="ID" name="ID" required>
                        </div>
                        <%
                            } else {
                        %>
                        <!--<div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="ID: <%=ID%>" name="ID" value="<%=ID%>">
                        </div>-->
                        <%
                            }
                        %>

                        <input type="hidden" name="username" value="<%=user.getUsername()%>">
                        <input type="hidden" name="type" value="<%=user.getUsertype()%>">
                        
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
                        <p>Comeback to <a href="Home.jsp">Home</a></p>
                    </div>

                    <img src="infor.svg" class="image" alt="">
                </div>
            </div>
        </div>
    </body>
</html>
