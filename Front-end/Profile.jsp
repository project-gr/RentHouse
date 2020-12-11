<%-- 
    Document   : Profile
    Created on : Dec 11, 2020, 9:42:53 PM
    Author     : ADMIN
--%>

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
        <div class="wrapper-profile">
            <div class="left">
                <img src="profile.svg" alt="user" width="160">
                <h4>Dang Viet Hung</h4>
                <!--tên user. dùng query-->
                <p>123456789</p>
                <!--chứng minh thư của user. dùng query-->
            </div>
            <div class="right">
                <div class="info">
                    <h3>Information</h3>
                    <div class="info-data">
                        <div class="data">
                            <h4>Email</h4>
                            <p>nohobao@gmail.com</p>
                            <!--email của user. dùng query-->
                        </div>
                        <div class="data">
                            <h4>Phone</h4>
                            <p>+1 234 567 890</p>
                            <!--phone của user. dùng query-->
                        </div>
                    </div>
                </div>
                
                <div class="house">
                    <h3>Houses</h3>
                    <div class="house-data">
                        <div class="data">
                            <h4>No.O.Houses</h4>
                            <p>6</p>
                            <!--số nhà landlord đang sở hữu-->
                        </div>
                        <div class="data">
                            <h4>List</h4>
                            <p>
                                <a href="#">H123</a>, <a href="#">H456</a>, <a href="#">H789</a>,
                                <a href="#">H123</a>, <a href="#">H456</a>, <a href="#">H789</a>
                            </p>
                            <!--liệt kê nhà mà landlord đã đăng ký trên web-->
                        </div>
                    </div>
                </div>
                
                <div class="social-media">
                    <ul>
                        <li><a href="=#"><i class="fab fa-facebook-f"></i></a></li>
                        <li><a href="=#"><i class="fab fa-instagram"></i></a></li>
                        <li><a href="=#"><i class="fab fa-twitter"></i></a></li>
                        <li><a href="=#"><i class="fab fa-youtube"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
