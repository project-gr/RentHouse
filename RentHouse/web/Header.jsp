<%-- 
    Document   : Header
    Created on : Dec 9, 2020, 9:39:52 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.bean.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="cssHeader.css">
    </head>
    <body>
        
        
        <header>
            <div class="container">
                <!--<input type="checkbox" name="" id="check">-->

                <div class="logo-container">
                    <a href="Home.jsp"><h3 class="logo">Eleven<span>Group</span></h3></a>
                </div>
                <div class="nav-btn">
                    <div class="nav-links">
                        <ul>
                            <li class="nav-link">
                                <a href="Home.jsp">Home</a>
                            </li>

                            <li class="nav-link">
                                <a href="">City<i class="fas fa-caret-down"></i></a>
                                <div class="dropdown">
                                    <ul>
                                        <li class="dropdown-link">
                                            <a href="SearchControl?type=City&search=Ha Noi">Ha Noi<i class="fas fa-caret-down"></i></a>
                                            <div class="dropdown second">
                                                <ul>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Ba Dinh">Ba Dinh</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Hoan Kiem">Hoan Kiem</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Dong Da">Dong Da</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Cau Giay">Cau Giay</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Long Bien">Long Bien</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Hai Ba Trung">Hai Ba Trung</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Thanh Xuan">Thanh Xuan</a>
                                                    </li>
                                                    <div class="arrow"></div>
                                                </ul>
                                            </div>
                                        </li>

                                        <li class="dropdown-link">
                                            <a href="SearchControl?type=City&search=TP HCM">Ho Chi Minh<i class="fas fa-caret-down"></i></a>
                                            <div class="dropdown second">
                                                <ul>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=1">District 1</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=2">District 2</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=3">District 3</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=4">District 4</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=5">District 5</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=6">District 6</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=7">District 7</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=8">District 8</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=9">District 9</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=10">District 10</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=11">District 11</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=12">District 12</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Tan Binh">Tan Binh</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Go Vap">Go Vap</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Thu Duc">Thu Duc</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Tan Phu">Tan Phu</a>
                                                    </li>
                                                    <div class="arrow"></div>
                                                </ul>
                                            </div>
                                        </li>

                                        <li class="dropdown-link">
                                            <a href="SearchControl?type=City&search=Da Nang">Da Nang<i class="fas fa-caret-down"></i></a>
                                            <div class="dropdown second">
                                                <ul>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Thanh Khe">Thanh Khe</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Hai Chau">Hai Chau</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Cam Le">Cam Le</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Ngu Hanh Son">Ngu Hanh Son</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Son Tra">Son Tra</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Lien Chieu">Lien Chieu</a>
                                                    </li>
                                                    <div class="arrow"></div>
                                                </ul>
                                            </div>
                                        </li>

                                        <li class="dropdown-link">
                                            <a href="SearchControl?type=City&search=Can Tho">Can Tho<i class="fas fa-caret-down"></i></a>
                                            <div class="dropdown second">
                                                <ul>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Ninh Kieu">Ninh Kieu</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Binh Thuy">Binh Thuy</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Cai Rang">Cai Rang</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=O Mon">O Mon</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="SearchControl?type=District&search=Thot Not">Thot Not</a>
                                                    </li>
                                                    <div class="arrow"></div>
                                                </ul>
                                            </div>
                                        </li>
                                        <div class="arrow"></div>
                                    </ul>
                                </div>
                            </li>

                            <li class="nav-link">
                                <a href="Home.jsp">Search</a>
                            </li>

                            <li class="nav-link">
                                <a href="ContactUs.jsp">Contact us</a>
                            </li>
                        </ul>
                    </div>

                    <%
                        Users user = (Users) session.getAttribute("user");

                        if (user == null) {
                    %>
                    <div class="log-sign">
                        <a href="SignIn.jsp" class="btn transparent">Sign In</a>
                        <a href="SignUp.jsp" class="btn solid">Sign Up</a>
                    </div>
                    <%
                    } else {
                    %>
                    <div class="log-sign">
                        <a href="CheckProfile.jsp" class="btn transparent">Profile</a>
                        <a href="SignOut.jsp" class="btn solid">Sign Out</a>
                    </div>
                    <%
                        }
                    %>
                </div>

                <div class="hamburger-menu-container">
                    <div class="hamburger-menu">
                        <div></div>
                    </div>
                </div>
            </div>
        </header>
        <script src="jsHeader.js"></script>
    </body>
</html>
