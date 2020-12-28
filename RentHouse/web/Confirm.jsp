<%-- 
    Document   : Login
    Created on : Jun 13, 2020, 10:36:02 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation Page</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato&display=swap">

        <!--<script src="checkSignUp.js"></script>-->

        <style>
            h2{
                color: #505f75;
            }
            input{
                color: #505f75;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <div class="cont">
                <div class="form sign-in">
                    <h2>Confirmation Message</h2>
                    <br>
                    <h7>Dear customer!</h7>
                    <p>
                        <br>
                        We have received your request.<br>
                        We will try to send you a reply as soon as possible.<br>
                        Please check your email regularly.<br><br>
                        Thanks with regard!<br>
                    </p>
                </div>


                <div class="sub-cont">
                    <div class="img">
                        <div class="img-text m-up">
                            <p>If you don't have any questions, you can return to the Homepage <a href="Home.jsp" >HERE</a></p>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!--<script type="text/javascript" src="testjs.js"></script>-->
        <%@ include file="Footer.jsp" %>
    </body>
</html>
