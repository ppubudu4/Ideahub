<%-- 
    Document   : welcome
    Created on : Jul 11, 2018, 8:08:54 AM
    Author     : Achintha
--%>

<%@page import="com.dea.bean.universityuser"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        universityuser universityuser=(universityuser)session.getAttribute("universityuser");
        if(universityuser !=null)
        {
            out.println("Welcome " +universityuser.getName());
            out.println("<br>");
            out.println("<a href="+"universitylogout.jsp"+">Logout</a>");
        }
        else
        {
        response.sendRedirect("universitylogin.html");
        }
    %>
    <body>
        <h1>Welcome University</h1>
    </body>
</html>
