<%-- 
    Document   : SignUp
    Created on : Nov 30, 2020, 5:40:28 PM
    Author     : Ren
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
        <link rel="stylesheet" type="text/css" href="cssSignUp.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
        
        <!--Java Script-->
        <script type="text/javascript" src="myFunction.js"></script>
    </head>
    
    <body>
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">

                    <!--Form-->
                    <form action="SignUpControl" class="sign-up-form" method="post"> <%-- Sign up control --%>
                        <h2 class="title" > Create new account </h2>

                        <!--Username-->
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Username" name="username" required/>
                        </div>

                        <!--Password-->
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Password" id="password" name="password" required/>
                            <span class="eye" onclick="showPassword()">
                                <i id="hide" class="fa fa-eye"></i>
                                <i id="show" class="fa fa-eye-slash"></i>
                            </span>
                        </div>

                        <!--Confirm Password-->
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Confirm Password" id="confirmPassword" name="confirmPassword" required/>
                            <span class="eye" onclick="showConfirmPassword()">
                                <i id="hide1" class="fa fa-eye"></i>
                                <i id="show1" class="fa fa-eye-slash"></i>
                            </span>
                        </div>

                        <!--Type-->
                        <div>
                            <select class="input-field" id="type" name="type" style="width:400px;" >
                                <option value="Landlord"> Landlord</option>
                                <option value="Student" selected> Student </option>
                            </select>
                        </div>
                        
                        <!--Submit-->
                        <input type="submit" class="btn" value="Sign Up" onclick="return Validate()"/>
                        
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
                        
            <!--Go to Sign in-->
            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>One of us?</h3>
                        <p>
                            If you have an account,
                            please press this button to Sign in!
                        </p>
                        <button class="btn transparent" onclick="location.href = 'SignIn.jsp'">Sign in</button>
                        <p>Comeback to <a href="Home.jsp">Home</a></p>
                    </div>

                    <img src="signUp.svg" class="image" alt="">
                </div>
            </div>
        </div>
    </body>
</html>
