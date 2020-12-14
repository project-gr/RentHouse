<%-- 
    Document   : forgotPass
    Created on : Dec 14, 2020, 12:38:49 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="cssAll.css">
        <link rel="stylesheet" type="text/css" href="cssSignIn.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    </head>
    <body>
        <main>
            <div class="container">
                <div class="forms-container">
                    <div class="signin-signup">

                        <%-- Sign in form --%>
                        <form action="forgotPassServlet" class="sign-in-form" method="post"> <%-- Login Control --%>
                            <h2 class="title">Forgot Password?</h2>
                            <p>
                                Please input your username!
                                <br>
                                We will send you an email for new password
                            </p>
                            <br>

                            <!--Username-->
                            <div class="input-field">
                                <i class="fas fa-user"></i>
                                <input type="text" placeholder="Username" name="username" required>
                            </div>


                            <input type="submit" value="Send Email" class="btn solid">

                        </form>
                    </div>
                </div>

                <div class="panels-container">
                    <div class="panel left-panel">
                        <div class="content">
                            <h3>Come back to Sign In</h3>
                            <p>
                                Please press this button to come back to Sign In
                            </p>
                            <button class="btn transparent" onclick="location.href = 'SignIn.jsp'">Sign in</button>
                        </div>

                        <img src="signIn.svg" class="image" alt="">
                    </div>
                </div>
        </main>

    </body>
</html>
