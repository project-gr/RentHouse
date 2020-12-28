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
        <title>ELEVEN GROUP</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="cssHome.css">
        <link rel="stylesheet" type="text/css" href="cssSearch.css">

        <!--Java Script-->
        <!--<script type="text/javascript" src="myFunction.js"></script>--> 
        <script type="text/javascript" src="jsSearch.js"></script>

        <%@ include file="Header.jsp" %>
    </head>
    <body>
        <main>
            <section>
                <div class="overlay">
                    <div class="search-container">
                        <h1 class="title">Searching</h1>
                        <!--<div class="form-group">-->
                            <form class="form-group" action="SearchControl" method="post">
                                <div class="dropdown-search">
                                    <div class="dropdown-search-list">
                                        <select name="type">
                                            <option hidden="true"> Category </option>
                                            <option value="Street"> Street </option>
                                            <option value="District"> District </option>
                                            <option value="City"> City </option>
                                        </select>
                                    </div>
                                </div>

                                <div class="search">
                                    <input type="text" class="search-input" name="search" placeholder="Search...">
                                </div>

                                <button type="submit" class="search-btn"><i class="fas fa-search"></i></button>
                            </form>

                        <!--</div>-->
                    </div>
                </div>
            </section>
        </main>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
