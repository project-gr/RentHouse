<%-- 
    Document   : AddHouse
    Created on : Dec 14, 2020, 4:28:55 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload House</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <link rel="stylesheet" type="text/css" href="cssProfile.css">

    </head>
    <body>
        <form action="UploadHouse" method="post" enctype="multipart/form-data">
            <header>
                <%@ include file="Header.jsp" %>
            </header>
            <center>
                <div class="wrapper-profile">
                    <div class="left">
                        <div class="info-data">
                            <div class="data" style="padding-top: 17%;">
                                <input type="file" placeholder="Cover Image" name="coverImage" id="coverImage" required/>
                            </div>
                            <div class="data" style="padding-top: 65%;">
                                <h4>Price</h4>
                                <input type="text" name="price" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="right">
                        <div class="info">
                            <h3>Address</h3>
                            <div class="info-data">
                                <div class="data">
                                    <input type="text" name="address" placeholder="Apartment Number" required="required">
                                    <input type="text" name="street" placeholder="Street" required="required">
                                </div>
                                <div class="data">
                                    <input type="text" name="district" placeholder="District" required="required">
                                    <input type="text" name="city" placeholder="City" required="required">
                                </div>
                            </div>
                        </div>

                        <div class="house">
                            <h3>Details</h3>
                            <div class="house-data">
                                <div class="data">
                                    <h4>No.O.Houses</h4>
                                    <input type="text" name="houseno" required="required">
                                </div>
                                <div class="data">
                                    <h4>Description</h4>
                                    <textarea name="description" required="required"></textarea>
                                </div>
                            </div>
                        </div>
                        <input type="submit" value="Upload" class="btn solid">
                    </div>
                </div>
            </center>
        </form>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
