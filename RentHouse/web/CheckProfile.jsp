<%-- 
    Document   : CheckProfile
    Created on : Dec 15, 2020, 11:49:52 PM
    Author     : ADMIN
--%>

<%@page import="com.renthouse.dao.UserDAO"%>
<%@page import="com.renthouse.bean.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Users user = (Users) session.getAttribute("user");
            
            if (user == null) {
                response.sendRedirect("SignIn.jsp");
            }

            String type = user.getUsertype();
            if(type.equals("Student")){
                response.sendRedirect("ProfileStudent.jsp");
            }
            else if(type.equals("Landlord")){
                response.sendRedirect("Profile.jsp");
            }
            else{
                response.sendRedirect("Profile.jsp");
            }
        %>
    </body>
</html>
