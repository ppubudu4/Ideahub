<%-- 
    Document   : industrylogout
    Created on : Jul 11, 2018, 10:24:23 AM
    Author     : Achintha
--%>


    
<%
session.setAttribute("user", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>


