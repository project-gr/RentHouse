<%-- 
    Document   : ContactUs
    Created on : Dec 11, 2020, 9:02:54 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <link rel="stylesheet" type="text/css" href="cssContactUs.css">
    </head>
    <body>
        <section class="contactUs">
            <div class="content">
                <h2>Contact Us</h2>
                <p>
                    Our website provides you information about the Company of webwite.
                    Fill out the email form below to send your problem for staff.
                    If you do not have problem, please press
                    <!-- gắn link vô chữ HERE để quay lại trang home page-->
                    <a href="Home.jsp">HERE</a> to return.
                </p>
            </div>
            <div class="container">
                <div class="contactInfo">
                    <div class="box">
                        <div class="icon">
                            <i class="fas fa-map-marker-alt"></i>
                        </div>
                        <div class="text">
                            <h3>Address</h3>
                            <p>
                                123, Phan Xich Long Street,<br>
                                Ward 01, Binh Thanh District,<br>
                                Ho Chi Minh City
                            </p>
                            <!--địa chỉ công ty-->
                        </div>
                    </div>
                    <div class="box">
                        <div class="icon">
                            <i class="fas fa-phone-alt"></i>
                        </div>
                        <div class="text">
                            <h3>Phone</h3>
                            <p>+1 234 567 890</p>
                            <!--số điện thoại công ty-->
                        </div>
                    </div>
                    <div class="box">
                        <div class="icon">
                            <i class="far fa-envelope"></i>
                        </div>
                        <div class="text">
                            <h3>Email</h3>
                            <p>hyylinh2912@gmail.com</p>
                            <!--email công ty-->
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
                            <!--email này là email sẽ gửi mail cho staff-->
                        </div>
                        <div class="inputBox">
                            <textarea required="required"></textarea>
                            <span>Type your Message...</span>
                            <!--type các vấn đề cần gặp phải. vd: tố cáo landlord lừa đảo,...-->
                        </div>
                        <div class="inputBox">
                            <input type="submit" name="" value="Send">
                        </div>
                    </form>
                </div>
            </div>
        </section>
    </body>
</html>
