<%-- 
    Document   : ProfileStudent
    Created on : Dec 11, 2020, 11:18:17 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.dao.StudentDAO"%>
<%@page import="com.renthouse.bean.Student"%>
<%@page import="com.renthouse.dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <link rel="stylesheet" type="text/css" href="cssProfile.css">
    </head>
    <body>
        <header>
            <%@ include file="Header.jsp" %>
        </header>
    <center>
        <%            user = (Users) session.getAttribute("user");

            if (user == null) {
                response.sendRedirect("SignIn.jsp");
            }

            UserDAO userDAO = new UserDAO();

            String ID = userDAO.getStudentID(user.getUsername());
            Student student = userDAO.getStudent(user.getUsername());
            StudentDAO studentDAO = new StudentDAO();
        %>
        <div class="wrapper-profile">
            <div class="left">
                <img src="profile.svg" alt="user" width="160">
                <h4><%=student.getStudentName()%></h4>
                <!--tên user. dùng query-->
                <p><%=student.getStudentID()%></p>
                <!--chứng minh thư của user. dùng query-->
            </div>
            <div class="right">
                <div class="info">
                    <h3>Information</h3>
                    <div class="info-data">
                        <div class="data">
                            <h4>Email</h4>
                            <p><%=student.getStudentMail()%></p>
                            <!--email của user. dùng query-->
                        </div>
                        <div class="data">
                            <h4>Phone</h4>
                            <p><%=student.getStudentPhone()%></p>
                            <!--phone của user. dùng query-->
                        </div>
                    </div>
                </div>

                <div class="house">
                    <h3>Houses</h3>
                    <div class="house-data">
                        <div class="data">
                            <h4>Status</h4>
                            <p class="status"><%=student.getStatus()%></p>
                            <!--trạng thái của student/ thuê hay chưa thuê-->
                        </div>
                        <div class="data">
                            <h4>List</h4>
                            <p>
                                <a href="#"></a>
                            </p>
                            <!--nhà mà student đang thuê-->
                        </div>
                    </div>
                </div>

                <div>
                    <button class="btn transparent" onclick="location.href = 'CreateInfo.jsp'">Change Information</button>
                </div>
            </div>
        </div>
    </center>
    <%@ include file="Footer.jsp" %>
</body>
</html>
