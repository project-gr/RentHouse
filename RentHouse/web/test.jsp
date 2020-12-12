<%-- 
    Document   : Search
    Created on : Dec 9, 2020, 9:38:38 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
<!--        <link rel="stylesheet" type="text/css" href="cssSearch2.css">-->
    </head>
    <body>
        <header>
            <%@ include file="Header.jsp" %>
        </header>
    <center>

        <div class="row">
            <div>
                <h1>BEST SELLER</h1>
                <div class="col-md-4" style="padding: 5px;">
                    <div style="margin:3px; padding:10px; background-color: #E5E8E8;">
                        <div class="row">
                            <div class="col-md-4">
                                <img src="house1.jpg" style="max-height: 130px; max-width: 110px;">
                            </div>
<!--                            <div class="col-md-8" style="text-align: left; padding-left:10px;">

                                <a href="BookLookUp?isbn=${book.getIsbn()}">
                                    <h4>${book.getTitle()}</h4>
                                </a>
                                <h5> ${book.getIsbn()} </h5>
                                <h5> $ ${book.getPrice()} </h5>
                                &nbsp;
                            </div>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </center>
    <%--<%@ include file="Footer.jsp" %>--%>
</body>
</html>
