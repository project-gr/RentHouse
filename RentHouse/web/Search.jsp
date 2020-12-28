<%-- 
    Document   : Search
    Created on : Dec 9, 2020, 9:38:38 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.dao.StudentDAO"%>
<%@page import="com.renthouse.bean.Student"%>
<%@page import="com.renthouse.dao.UserDAO"%>
<%@page import="com.renthouse.bean.House"%>
<%@page import="com.renthouse.dao.HouseDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
        <link rel="stylesheet" type="text/css" href="cssSearch2.css">
        <!--<script type="text/javascript" src="myFunction.js"></script>-->
    </head>
    <body>
        <%--<jsp:useBean id="houseList" class="com.renthouse.dao.HouseDAO" scope="request"></jsp:useBean>--%>

        <%@ include file="Header.jsp" %>
        <%-- Show houses --%>
        <main>           
            <%                List<House> houseList = (List<House>) request.getAttribute("houseList");

                for (House house : houseList) {
            %>

            <div class="card">
                <div class="imgBox">
                    <img src="Images/<%= house.getCoverImage()%>">
                </div>

                <div class="details">
                    <div class="textContent">
                        <h3><%--<%= house.getHouseID()%>--%> Price: </h3> <%-- ID of houses --%>
                        <div class="price"> $ <%= house.getPrice()%> </div> <%-- Price of houses --%>
                    </div>
                    <h4>Status</h4>
                    <%
                        int status = (Integer) house.getHouseStatus();
                        if (status == 0) {
                    %>
                    <div class="status">Available</div>
                    <button onclick="location.href = 'ContactLandlord.jsp?houseID=${house.getHouseID()}'
                            <%session.setAttribute("house", house);%>">Order It Now</button>
                    <%
                    } else {
                    %>
                    <div class="status">Rented</div>
                    <button onclick="houseRented()">Order It Now</button>
                    <%
                        }

                    %>

                </div>

                <div class="description">
                    <div class="icon"><i class="fas fa-info-circle"></i></div>
                    <div class="contents">
                        <h2><%= house.getHouseID()%></h2> <%-- ID of houses --%>
                        <hr><br>
                        <p>Address number: <%= house.getAddress()%> </p>
                        <p>Street: <%= house.getStreet()%> </p>
                        <p>District: <%= house.getDistrict()%></p>
                        <p>City: <%= house.getCity()%> </p>
                        <p>Room: <%= house.getHouseNo()%> </p>
                        <p>Description: <%= house.getDescription()%> </p>
                    </div>
                </div>
            </div>
            <%
                }
            %>
        </main>
        <%@ include file="Footer.jsp" %>

        <script>
            function houseRented() {
                alert("House is already rented.\n\Please choose another one!!!!!");
            }
        </script>

    </body>
</html>
