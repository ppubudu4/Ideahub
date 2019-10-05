<%-- 
    Document   : adminregister
    Created on : Jul 11, 2018, 10:48:30 AM
    Author     : Achintha
--%>

<%@page import="com.dea.dao.adminuserdao" %>
    
<jsp:useBean id="u" class="com.dea.bean.adminuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
   int status = adminuserdao.save(u);
   if(status > 0 )
   {
      response.sendRedirect("adminlogin.html");
   }
   else
   {
       out.print("There is a Error");
   } 
%>