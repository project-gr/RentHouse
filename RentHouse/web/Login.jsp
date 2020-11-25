<%-- 
    Document   : Login
    Created on : Nov 24, 2020, 2:32:20 PM
    Author     : Ren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginControl" method="post">
            <center>
                <h1>Login</h1>
                <table>
                    <tr>
                        <td class ="color_text">User Name</td>
                        <td><input type="text" placeholder="Username" name="username" required></td>
                    </tr>
                    <tr>
                        <td class ="color_text">Password</td>
                        <td><input type="password" placeholder="Password" name="password" required></td>
                    </tr>    
                </table>
                <button class="button" type="submit">Login</button>
            </center>
        </form>
    </body>
</html>
