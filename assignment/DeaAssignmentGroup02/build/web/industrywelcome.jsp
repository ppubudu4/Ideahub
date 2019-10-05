<%-- 
    Document   : industrywelcome
    Created on : Jul 11, 2018, 10:31:47 AM
    Author     : Achintha
--%>

<%@page import="com.dea.bean.industryuser"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        industryuser industryuser=(industryuser)session.getAttribute("industryuser");
        if(industryuser !=null)
        {
            out.println("Welcome " +industryuser.getName());
            out.println("<br>");
            out.println("<a href="+"industrylogout.jsp"+">Logout</a>");
        }
        else
        {
        response.sendRedirect("industrylogin.html");
        }
    %>
    <body>
        <h1>Welcome Office</h1>
    </body>
</html>

