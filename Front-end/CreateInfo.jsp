<%-- 
    Document   : CreateInfo
    Created on : Dec 2, 2020, 10:56:03 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Information Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="cssInfor.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="forms-container">
                <div class="infor">
                    <form action="#" class="infor-form"> <%-- Information Control --%>
                        <h2 class="title">Information</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Name" name="#" required>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="ID" name="#" required>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="email" placeholder="Email" name="#" required>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Phone Number" name="#" required>
                        </div>
                        <br>
                        <input type="submit" value="Create" class="btn solid">
                    </form>
                </div>
            </div>
            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>One of us?</h3>
                        <p>
                            If you have an account,
                            please press this button to Sign in!
                        </p>
                        <button class="btn transparent" onclick="location.href='Signin.jsp'">Sign in</button>
                    </div>

                    <img src="infor.svg" class="image" alt="">
                </div>
            </div>
        </div>
    </body>
</html>
