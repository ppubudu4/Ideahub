<%@page import="com.dea.dao.universityuserdao" %>
    
<jsp:useBean id="u" class="com.dea.bean.universityuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
   int status = universityuserdao.save(u);
   if(status > 0 )
   {
      response.sendRedirect("login_university.html");
   }
   else
   {
       out.print("There is a Error");
   } 
%>