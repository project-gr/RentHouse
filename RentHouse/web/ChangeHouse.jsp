<%-- 
    Document   : ChangeHouse
    Created on : Dec 16, 2020, 11:48:30 PM
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
        <form action="ChangeHouseControl" method="post">
            <header>
                <%@ include file="Header.jsp" %>
            </header>
            <center>
                <div class="wrapper-profile">
                    <div class="left">
                        <div class="info-data">
                            <div class="data">
                                <h4>Status</h4>
                                <select name="Status">
                                    <option value="1">Rented</option>
                                    <option value="0">Available</option>
                                </select>
                            </div>
                            <div class="data" style="padding-top: 65%;">
                                <h4>Price</h4>
                                <input type="text" name="Price" placeholder="Price">
                            </div>
                        </div>
                    </div>
                    <div class="right">
                        <div class="info">
                            <h3>House ID</h3>
                            <div class="info-data">
                                <div class="data">
                                    <input type="text" name="HouseID" placeholder="HouseID">
                                </div>
                            </div>
                        </div>
                        <div class="info">
                            <h3>Address</h3>
                            <div class="info-data">
                                <div class="data">
                                    <input type="text" name="Address" placeholder="Address">
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
                                    <h4>No.O.Houses</h4>
                                    <input type="text" name="HouseNo" placeholder="HouseNo">
                                </div>
                                <div class="data">
                                    <h4>Description</h4>
                                    <input type="text" name="Description" placeholder="Description">
                                </div>
                            </div>
                        </div>
                        <input type="submit" value="Save" class="btn solid">
                    </div>
                </div>
            </center>
        </form>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
