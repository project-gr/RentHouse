<%-- 
    Document   : ContactLandlord
    Created on : Dec 10, 2020, 11:45:41 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.dao.HouseDAO"%>
<%@page import="com.renthouse.dao.LandlordDAO"%>
<%@page import="com.renthouse.bean.Landlord"%>
<%@page import="com.renthouse.bean.House"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <link rel="stylesheet" type="text/css" href="cssContactLandlord.css">
    </head>
    <body>
        <header>
            <%@ include file="Header.jsp" %>
        </header>
        <%
            HouseDAO houseDAO = new HouseDAO();
            House house = (House) session.getAttribute("house");
            String HouseID = house.getHouseID();
            Landlord landlord = new Landlord();
            landlord = houseDAO.getLandlord(HouseID);
        %>
        <form action="OrderHouse" class="sign-in-form" method="post"> <%-- Login Control --%>
            <section class="contactLandlord">
                <div class="content">
                    <h2>Contact Landlord</h2>
                    <p>
                        Our website provides you information about landlord of the house you want to order.
                        Fill out the email form below to schedule an appointment with landlord.
                        If you do not want to order this house, please press
                        <!-- gắn link vô chữ HERE để quay lại trang hiện kết quả search nhà trước đó-->
                        <a href="Home.jsp">HERE</a> to return.
                    </p>
                </div>
                <div class="container">
                    <div class="contactInfo">
                        <div class="box">
                            <div class="icon">
                                <i class="fas fa-signature"></i>
                            </div>
                            <div class="text">
                                <h3>Name</h3>
                                <p><%=landlord.getLandlordName()%></p>
                                <!--tên landlord của ngôi nhà student đã chọn để order-->
                            </div>
                        </div>
                        <div class="box">
                            <div class="icon">
                                <i class="fas fa-phone-alt"></i>
                            </div>
                            <div class="text">
                                <h3>Phone</h3>
                                <p><%=landlord.getLandlordPhone()%></p>
                                <!--số điện thoại landlord của ngôi nhà student đã chọn để order-->
                            </div>
                        </div>
                        <div class="box">
                            <div class="icon">
                                <i class="far fa-envelope"></i>
                            </div>
                            <div class="text">
                                <h3>Email</h3>
                                <p><%=landlord.getLandlordMail()%></p>
                                <!--email landlord của ngôi nhà student đã chọn để order-->
                            </div>
                        </div>
                    </div>

                    <div class="contactForm">
                        <h2>Send Message</h2>
                        <div class="inputBox">
                            <input type="text" name="fname" required="required">
                            <span>Full Name</span>
                            <!--student tự điền tên của mình.k cần query-->
                        </div>
                        <div class="inputBox">
                            <input type="text" name="email" required="required">
                            <span>Email</span>
                            <!--student tự điền email của mình.k cần query-->
                            <!--email này là email sẽ gửi mail cho landlord-->
                        </div>
                        <div class="inputBox">
                            <input type="text" name="phone" required="required">
                            <span>Phone</span>
                        </div>
                        <div class="inputBox">
                            <textarea name="message" required="required"></textarea>
                            <span>Type your Message...</span>
                            <!--type lịch hẹn gặp landlord. vd: mấy giờ ngày mấy tháng mấy hẹn xem nhà-->
                        </div>
                        <div class="inputBox">
                            <input type="submit" name="" value="Send">
                        </div>
                    </div>
                </div>
            </section>
        </form>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
