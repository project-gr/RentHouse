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
        <title>JSP Page</title>
    </head>
    <body>
        <form action="forgotPassServlet" method="post">
            <h1>Forgot Password</h1>
            <table> 
                <tr> 
                    <td>Username: </td> 
                    <td><input type="text" name="username" placeholder="Username"></td>
                </tr>
            </table>
            <button type="submit">Send Email</button>
            <button type="reset">Cancel</button>
            <a href="SignIn.jsp">Sign In</a>
        </form>

        
    </body>
</html>
