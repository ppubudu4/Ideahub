<%-- 
    Document   : adminlogin
    Created on : Jul 11, 2018, 10:43:01 AM
    Author     : Achintha
--%>

<%@page import="com.dea.dao.adminuserdao" %>
    
<jsp:useBean id="u" class="com.dea.bean.adminuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
    boolean isValid = adminuserdao.isAutheticate(u);
     if(isValid){
         session.setAttribute("adminuser", u);
         response.sendRedirect("adminwelcome.jsp");
                }
      else{
         out.println("Login UnSuccesfull");
            
           }
    %>
            