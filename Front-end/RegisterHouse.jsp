<%-- 
    Document   : RegisterHouse
    Created on : Dec 12, 2020, 8:14:50 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <script src="https://kit.fontawesome.com/64d58efce2.js"></script>
        <link rel="stylesheet" type="text/css" href="cssRegisterHouse.css">
    </head>
    <body>
        <%@ include file="Header.jsp" %>
        <div class="wrapper-register">
            <div class="title">
                Registration Form
            </div>
            <div class="form">
                <div class="input-field">
                    <label>ID House</label>
                    <input type="text" class="input">
                    <!--id của nhà-->
                </div>
                <div class="input-field">
                    <label>Price</label>
                    <input type="text" class="input">
                </div>
                <div class="input-field">
                    <label>No. House</label>
                    <input type="text" class="input">
                    <!--số phòng-->
                </div>
                <div class="input-field">
                    <label>Street</label>
                    <input type="text" class="input">
                </div>
                <div class="input-field">
                    <label>District</label>
                    <input type="text" class="input">
                </div>
                <div class="input-field">
                    <label>City</label>
                    <div class="custom-select">
                        <select>
                            <option value="">Select</option>
                            <option value="hcm">Ho Chi minh</option>
                            <option value="hn">Ha Noi</option>
                        </select>
                    </div>
                </div>
                <div class="input-field terms">
                    <label class="check">
                        <input type="checkbox">
                        <span class="checkmark"></span>
                    </label>
                    <p>Agreed to terms and conditions.</p>
                </div>
                <div class="input-field">
                    <input type="submit" class="btn" value="Register">
                </div>
            </div>   
        </div>

        <div class="upload-image">
            <div class="container-image">
                <div class="wrapper-image">
                    <div class="image">
                        <img src="">
                    </div>
                    <div class="content">
                        <div class="icon">
                            <i class="fas fa-cloud-upload-alt"></i>
                        </div>
                        <div class="text">
                            No file chosen, yet!
                        </div>
                    </div>
                    <div id="cancel-btn"><i class="fas fa-times"></i></div>
                    <div class="file-name">File name here</div>
                </div>
                <input id="default-btn" type="file" hidden>
                <button onclick="defaultBtnActive()" id="custom-btn">Choose a file</button>
            </div>
        </div>
        
        <!--lại lỗi footer-->
        <%--<%@ include file="Footer.jsp" %>--%>
        <script src="jsImage.js"></script>
    </body>
</html>
