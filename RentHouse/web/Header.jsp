<%-- 
    Document   : Header
    Created on : Dec 9, 2020, 9:39:52 PM
    Author     : ADMIN
--%>

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
                <input type="checkbox" name="" id="check">

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
                                <a href="#">City<i class="fas fa-caret-down"></i></a>
                                <div class="dropdown">
                                    <ul>
                                        <li class="dropdown-link">
                                            <a href="#">Ha Noi<i class="fas fa-caret-down"></i></a>
                                            <div class="dropdown second">
                                                <ul>
                                                    <li class="dropdown-link">
                                                        <a href="#">Ba Dinh</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="#">Hoan Kiem</a>
                                                    </li>
                                                    <div class="arrow"></div>
                                                </ul>
                                            </div>
                                        </li>

                                        <li class="dropdown-link">
                                            <a href="#">Ho Chi Minh<i class="fas fa-caret-down"></i></a>
                                            <div class="dropdown second">
                                                <ul>
                                                    <li class="dropdown-link">
                                                        <a href="#">District 1</a>
                                                    </li>
                                                    <li class="dropdown-link">
                                                        <a href="#">District 2</a>
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

                    <div class="log-sign">
                        <a href="Signin.jsp" class="btn transparent">Sign In</a>
                        <a href="Signup.jsp" class="btn solid">Sign Up</a>
                    </div>
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
