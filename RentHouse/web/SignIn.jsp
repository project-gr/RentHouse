<%-- 
    Document   : SignIn
    Created on : Nov 30, 2020, 7:37:37 PM
    Author     : Ren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, intial-scale=1.0">
        <title>Sign in Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="cssAll.css">
        <link rel="stylesheet" type="text/css" href="cssSignIn.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    </head>

    <%-- Sign in --%>
    <body>
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <form action="LoginControl" class="sign-in-form"> <%-- Login Control --%>
                        <h2 class="title">Sign in</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Username" name="username" required>
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Password" name="password" required>
                        </div>
                        <input type="submit" value="Sign in" class="btn solid">

                        <p class="social-text">Or Sign in With social platforms</p>
                        <div class="social-media">
                            <a href="#" class="social-icon">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                        </div>
                    </form>
                </div>
            </div>
            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>New here?</h3>
                        <p>
                            If you do not have an account,
                            please press this button to register an new account!
                        </p>
                        <button class="btn transparent" onclick="location.href = 'SignUp.jsp'">Sign up</button>
                    </div>

                    <img src="signIn.svg" class="image" alt="">
                </div>
            </div>
        </div>    
    </body>
</html>
