<%-- 
    Document   : adminlogout
    Created on : Jul 11, 2018, 10:49:42 AM
    Author     : Achintha
--%>

<%
    
session.invalidate();
response.sendRedirect("adminlogin.html");

%>