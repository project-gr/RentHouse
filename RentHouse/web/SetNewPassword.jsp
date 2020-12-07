<%-- 
    Document   : SetNewPassword
    Created on : Dec 8, 2020, 12:43:00 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set New Password</title>
        <script type="text/javascript">
            function verfiypass() {
                var emailpattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                if (document.getElementById("mailid").value == "") {
                    alert("Enter Email ID ");
                    document.getElementById("mailid").focus();
                    return false;
                } else if (!emailpattern.test(document.getElementById("mailid").value)) {
                    alert("please enter valid e-mail address");
                    document.getElementById("mailid").focus();
                    return false;
                }
                if (document.getElementById("pwd").value == "") {
                    alert("Enter Password");
                    document.getElementById("pwd").focus();
                    return false;
                } else if (document.getElementById("cpwd").value == "") {
                    alert("Confirm the Password");
                    document.getElementById("cpwd").focus();
                    return false;
                } else if (document.getElementById("pwd").value != document
                        .getElementById("cpwd").value) {
                    alert("Password and Confirm password do not match");
                    document.getElementById("pwd").focus();
                    return false;
                } else {
                    return true;
                }
            }
        </script>
    </head>
    <body>
        <form method="post" action="./Reset">
            <table class="tablelayout curve">
                <caption>Set new Credentials</caption>
                <tr>
                    <td><label class="required">Enter your Registered mail id</label></td>
                    <td><input type="text" name="mailid" id="mailid" /></td>
                </tr>
                <tr>
                    <td><label class="required">Enter new Password</label></td>
                    <td><input type="password" name="pwd" id="pwd"></td>
                </tr>
                <tr>
                    <td><label class="required">Confirm Password</label></td>
                    <td><input type="password" name="cpwd" id="cpwd"></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input type="submit" value="submit"
                                                          onclick=" return verfiypass()" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
