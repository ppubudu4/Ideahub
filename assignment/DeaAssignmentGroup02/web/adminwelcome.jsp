<%-- 
    Document   : adminwelcome
    Created on : Jul 11, 2018, 10:50:31 AM
    Author     : Achintha
--%>

<%@page import="com.dea.bean.adminuser"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        adminuser adminuser=(adminuser)session.getAttribute("adminuser");
        if(adminuser !=null)
        {
            out.println("Welcome " +adminuser.getUsername());
            out.println("<br>");
            out.println("<a href="+"adminlogout.jsp"+">Logout</a>");
        }
        else
        {
        response.sendRedirect("adminlogin.html");
        }
    %>
    <body>
        <h1>Welcome Admin</h1>
    </body>
</html>
