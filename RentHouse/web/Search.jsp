<%-- 
    Document   : Search
    Created on : Dec 9, 2020, 9:38:38 PM
    Author     : ADMIN
--%>

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
    </head>
    <body>
        <%--<jsp:useBean id="houseList" class="com.renthouse.dao.HouseDAO" scope="request"></jsp:useBean>--%>

        <%@ include file="Header.jsp" %>
        <%-- Show houses --%>
        <main>
            <%
                List<House> houseList = (List<House>) request.getAttribute("houseList");

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
                        if (house.getHouseStatus() == 0) {
                    %>
                    <div class="status">Available</div>
                    <%
                        } else {
                    %>
                    <div class="status">Rented</div>
                    <%
                        }
                    %>
                    <button onclick="location.href = 'ContactLandlord.jsp'">Order It Now</button>
                </div>

                <div class="description">
                    <div class="icon"><i class="fas fa-info-circle"></i></div>
                    <div class="contents">
                        <h2><%= house.getHouseID()%></h2> <%-- ID of houses --%>
                        <hr><br>
                        <p>Number: <%= house.getAddress()%> </p>
                        <p>Street: <%= house.getStreet()%> </p>
                        <p>District: <%= house.getDistrict()%></p>
                        <p>City: <%= house.getCity()%> </p>
                        <p>Description: <%= house.getDescription()%> </p>
                    </div>
                </div>
            </div>
            <%
                }
            %>

            <!--            <div class="card">
                            <div class="imgBox">
                                <img src="Images/house1.jpg">
                            </div>
            
                            <div class="details">
                                <div class="textContent">
                                    <h3>ID123456</h3> <%-- ID of houses --%>
                                    <div class="price">2.0mil</div> <%-- Price of houses --%>
                                </div>
                                <h4>Status</h4>
                                <div class="status">Rented</div>
                                <button>Order It Now</button>
                            </div>
            
                            <div class="description">
                                <div class="icon"><i class="fas fa-info-circle"></i></div>
                                <div class="contents">
                                    <h2>ID123456</h2> <%-- ID of houses --%>
                                    <hr><br>
                                    <p>Number: 123</p>
                                    <p>Street: Phan Xich Long</p>
                                    <p>Ward: 01</p>
                                    <p>District: Binh Thanh</p>
                                    <p>City: Ho Chi Minh</p>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="imgBox">
                                <img src="Images/house1.jpg">
                            </div>
            
                            <div class="details">
                                <div class="textContent">
                                    <h3>ID123456</h3> <%-- ID of houses --%>
                                    <div class="price">2.0mil</div> <%-- Price of houses --%>
                                </div>
                                <h4>Status</h4>
                                <div class="status">Rented</div>
                                <button>Order It Now</button>
                            </div>
            
                            <div class="description">
                                <div class="icon"><i class="fas fa-info-circle"></i></div>
                                <div class="contents">
                                    <h2>ID123456</h2> <%-- ID of houses --%>
                                    <hr><br>
                                    <p>Number: 123</p>
                                    <p>Street: Phan Xich Long</p>
                                    <p>Ward: 01</p>
                                    <p>District: Binh Thanh</p>
                                    <p>City: Ho Chi Minh</p>
                                </div>
                            </div>
                        </div>
                        <div class="card">
                            <div class="imgBox">
                                <img src="Images/house1.jpg">
                            </div>
            
                            <div class="details">
                                <div class="textContent">
                                    <h3>ID123456</h3> <%-- ID of houses --%>
                                    <div class="price">2.0mil</div> <%-- Price of houses --%>
                                </div>
                                <h4>Status</h4>
                                <div class="status">Rented</div>
                                <button>Order It Now</button>
                            </div>
            
                            <div class="description">
                                <div class="icon"><i class="fas fa-info-circle"></i></div>
                                <div class="contents">
                                    <h2>ID123456</h2> <%-- ID of houses --%>
                                    <hr><br>
                                    <p>Number: 123</p>
                                    <p>Street: Phan Xich Long</p>
                                    <p>Ward: 01</p>
                                    <p>District: Binh Thanh</p>
                                    <p>City: Ho Chi Minh</p>
                                </div>
                            </div>
                        </div>-->
        </main>
        <%@ include file="Footer.jsp" %>

    </body>
</html>
