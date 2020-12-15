<%-- 
    Document   : Profile
    Created on : Dec 11, 2020, 9:42:53 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.bean.House"%>
<%@page import="java.util.List"%>
<%@page import="com.renthouse.dao.LandlordDAO"%>
<%@page import="com.renthouse.bean.Landlord"%>
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

        <%  user = (Users) session.getAttribute("user");

            if (user == null) {
                response.sendRedirect("SignIn.jsp");
            }

            UserDAO userDAO = new UserDAO();

            String ID = userDAO.getLandlordID(user.getUsername());
            Landlord landlord = userDAO.getLandlord(user.getUsername());
            LandlordDAO landlordDAO = new LandlordDAO();
            List<House> listHouse = landlordDAO.getListHouse(landlord.getLandlordID());
        %>


        <div class="wrapper-profile">
            <div class="left">
                <img src="profile.svg" alt="user" width="160">
                <h4><%=landlord.getLandlordName()%></h4>
                <!--tên user. dùng query-->
                <p><%=landlord.getLandlordID()%></p>
                <!--chứng minh thư của user. dùng query-->
            </div>
            <div class="right">
                <div class="info">
                    <h3>Information</h3>
                    <div class="info-data">
                        <div class="data">
                            <h4>Email</h4>
                            <p><%=landlord.getLandlordMail()%></p>
                            <!--email của user. dùng query-->
                        </div>
                        <div class="data">
                            <h4>Phone</h4>
                            <p><%=landlord.getLandlordPhone()%></p>
                            <!--phone của user. dùng query-->
                        </div>
                    </div>
                </div>

                <div class="house">
                    <h3>Houses</h3>
                    <div class="house-data">
                        <div class="data">
                            <h4>List</h4>
                            <p>
                                <%
                                    int count = 0;
                                    for (House h : listHouse) {
                                %>

                                <a href="#"><%=h.getHouseID()%></a>
                                <%
                                        count++;
                                    }
                                %>
                            </p>
                            <!--liệt kê nhà mà landlord đã đăng ký trên web-->
                        </div>

                        <div class="data">
                            <h4>No.O.Houses</h4>
                            <p><%=count%></p>
                        </div>
                    </div>
                </div>

                <div>
                    <button class="btn transparent" onclick="location.href = 'CreateInfo.jsp'">Change Information</button>
                    <button class="btn transparent" onclick="location.href = 'AddHouse.jsp'">Add House</button>
                </div>
                <div>
                    <button class="btn transparent" onclick="location.href = 'ChangeInfoHouse.jsp'">Change Information Of House</button>
                </div>
            </div>
        </div>
    </center>
    <%@ include file="Footer.jsp" %>
</body>
</html>
