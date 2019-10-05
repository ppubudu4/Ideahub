<%-- 
    Document   : industryregister
    Created on : Jul 11, 2018, 10:29:16 AM
    Author     : Achintha
--%>

<%@page import="com.dea.dao.industryuserdao" %>
    
<jsp:useBean id="u" class="com.dea.bean.industryuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
   int status = industryuserdao.save(u);
   if(status > 0 )
   {
      response.sendRedirect("login_industry.html");
   }
   else
   {
       out.print("There is a Error");
   } 
%>
