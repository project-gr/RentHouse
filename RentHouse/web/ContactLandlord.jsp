<%-- 
    Document   : ContactLandlord
    Created on : Dec 10, 2020, 11:45:41 PM
    Author     : ADMIN
--%>

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
        <section class="contactLandlord">
            <div class="content">
                <h2>Contact Landlord</h2>
                <p>
                    Our website provides you information about landlord of the house you want to order.
                    Fill out the email form below to schedule an appointment with landlord.
                    If you do not want to order this house, please press
                    <!-- gắn link vô chữ HERE để quay lại trang hiện kết quả search nhà trước đó-->
                    <a href="#">HERE</a> to return.
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
                            <p>Le Thi Phuong Linh</p>
                            <!--tên landlord của ngôi nhà student đã chọn để order-->
                        </div>
                    </div>
                    <div class="box">
                        <div class="icon">
                            <i class="fas fa-phone-alt"></i>
                        </div>
                        <div class="text">
                            <h3>Phone</h3>
                            <p>+1 234 567 890</p>
                            <!--số điện thoại landlord của ngôi nhà student đã chọn để order-->
                        </div>
                    </div>
                    <div class="box">
                        <div class="icon">
                            <i class="far fa-envelope"></i>
                        </div>
                        <div class="text">
                            <h3>Email</h3>
                            <p>hyylinh2912@gmail.com</p>
                            <!--email landlord của ngôi nhà student đã chọn để order-->
                        </div>
                    </div>
                </div>
                
                <div class="contactForm">
                    <form>
                        <h2>Send Message</h2>
                        <div class="inputBox">
                            <input type="text" name="" required="required">
                            <span>Full Name</span>
                            <!--student tự điền tên của mình.k cần query-->
                        </div>
                        <div class="inputBox">
                            <input type="text" name="" required="required">
                            <span>Email</span>
                            <!--student tự điền email của mình.k cần query-->
                            <!--email này là email sẽ gửi mail cho landlord-->
                        </div>
                        <div class="inputBox">
                            <textarea required="required"></textarea>
                            <span>Type your Message...</span>
                            <!--type lịch hẹn gặp landlord. vd: mấy giờ ngày mấy tháng mấy hẹn xem nhà-->
                        </div>
                        <div class="inputBox">
                            <input type="submit" name="" value="Send">
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
