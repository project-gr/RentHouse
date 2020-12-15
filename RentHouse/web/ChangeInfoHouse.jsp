<%-- 
    Document   : ChangeInfoHouse
    Created on : Dec 15, 2020, 11:59:29 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.dao.UserDAO"%>
<%@page import="com.renthouse.bean.Landlord"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Information Of House</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <link rel="stylesheet" type="text/css" href="cssProfile.css">

    </head>
    <body>
        <form action="ChangeHouseServlet" method="post" enctype="multipart/form-data">
            <header>
                <%@ include file="Header.jsp" %>
            </header>
            <center>                
                <h2>Change Information Of House</h2>
                <div class="wrapper-profile">
                    <div class="left">
                        <div class="info-data">
                            <div class="data" style="padding-top: 17%;">
                                <input type="file" placeholder="Cover Image" name="coverImage" id="coverImage"/>
                            </div>
                            <div class="data" style="padding-top: 65%;">
                                <h4>Price</h4>
                                <input type="text" name="Price">
                            </div>
                        </div>
                    </div>
                    <div class="right">
                        <div class="info">
                            <h3>House ID</h3>
                            <div class="info-data">
                                <div class="data">
                                    <input type="text" name="HouseID" placeholder="HouseID" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="info">
                            <h3>Address</h3>
                            <div class="info-data">
                                <div class="data">
                                    <input type="text" name="Address" placeholder="Apartment Number">
                                    <input type="text" name="Street" placeholder="Street">
                                </div>
                                <div class="data">
                                    <input type="text" name="District" placeholder="District">
                                    <input type="text" name="City" placeholder="City">
                                </div>
                            </div>
                        </div>

                        <div class="house">
                            <h3>Details</h3>
                            <div class="house-data">
                                <div class="data">
                                    <h4>No.O.Rooms</h4>
                                    <input type="text" name="houseno" required="required">
                                </div>
                                <div class="data">
                                    <h4>Description</h4>
                                    <textarea name="Description" required="required"></textarea>
                                </div>
                            </div>
                        </div>
                        <input type="submit" value="Save" class="btn solid">
                        <input onclick="location.href = 'Profile.jsp'" type="reset" value="Cancel" class="btn solid">
                    </div>
                </div>
            </center>
        </form>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
