<%-- 
    Document   : Home
    Created on : Nov 30, 2020, 5:39:24 PM
    Author     : Ren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Home Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="cssHome.css">
        <link rel="stylesheet" type="text/css" href="cssSearch.css">
        
        <!--Java Script-->
        <!--<script type="text/javascript" src="myFunction.js"></script>--> 
        <script type="text/javascript" src="jsSearch.js"></script>
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
                                <a href="#">Home</a>
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
                                <a href="#">About us</a>
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
        <main>
            <section>
                <div class="overlay">
                    <div class="search-container">
                        <h1 class="title">Searching</h1>
                        <div class="form-group">
                            <div class="dropdown-search">
                                <div class="default-option">Category</div>
                                <div class="dropdown-search-list">
                                    <ul>
                                        <li><i class="fas fa-road">&nbsp;</i>Street</li>
                                        <li><i class="fas fa-archway">&nbsp;</i>District</li>
                                        <li><i class="fas fa-city">&nbsp;</i>City</li>
                                    </ul>
                                </div>
                            </div>

                            <div class="search">
                                <input type="text" class="search-input" placeholder="Search...">
                            </div>

                            <button type="submit" class="search-btn"><i class="fas fa-search"></i></button>
                        </div>
                    </div>
                </div>
            </section>
        </main>
    </body>
</html>
