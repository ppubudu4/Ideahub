<%@page import="com.dea.dao.userDao" %>
    
<jsp:useBean id="u" class="com.dea.bean.user"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
   int status = userDao.save(u);
   if(status > 0 )
   {
      response.sendRedirect("login_student.html");
   }
   else
   {
       out.print("There is a Error");
   } 
%>