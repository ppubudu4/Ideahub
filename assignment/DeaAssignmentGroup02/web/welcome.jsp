<%-- 
    Document   : welcome
    Created on : Jul 11, 2018, 8:08:54 AM
    Author     : Achintha
--%>

<%@page import="com.dea.bean.user"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        user user=(user)session.getAttribute("user");
        if(user !=null)
        {
            out.println("Welcome " +user.getUsername());
            out.println("<br>");
            out.println("<a href="+"logout.jsp"+">Logout</a>");
        }
        else
        {
        response.sendRedirect("login.html");
        }
    %>
    <body>
        <h1>Welcome Student</h1>
    </body>
</html>
