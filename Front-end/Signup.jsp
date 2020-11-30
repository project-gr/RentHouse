<%-- 
    Document   : Signup
    Created on : Nov 28, 2020, 4:30:42 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, height=device-height, intial-scale=1.0">
        <title>Sign up Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="cssAll.css">
        <link rel="stylesheet" type="text/css" href="cssSignup.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <form action="#" class="sign-up-form">
                        <h2 class="title">Sign up</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" name="name" placeholder="Name" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-envelope"></i>
                            <input type="email" placeholder="Email" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-phone"></i>
                            <input type="text" placeholder="Phone" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Username" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" name="password" placeholder="Password" />
                        </div>
                        <div>
                            <input type="checkbox" name="role">
                            <label for="role">I am a landlord.</label>
                        </div>
                        <input type="submit" class="btn" value="Sign up" />
                        <p class="social-text">Or Sign up with social platforms</p>
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
                        <h3>One of us?</h3>
                        <p>
                            If you have an account,
                            please press this button to Sign in!
                        </p>
                        <button class="btn transparent" onclick="location.href='Signin.jsp'">Sign in</button>
                    </div>
                    
                    <img src="signup.svg" class="image" alt="">
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js1.js"></script>
    </body>
</html>
