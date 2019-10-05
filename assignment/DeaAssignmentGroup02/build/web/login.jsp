<%@page import="com.dea.dao.userDao" %>
    
<jsp:useBean id="u" class="com.dea.bean.user"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
    boolean isValid = userDao.isAutheticate(u);
     if(isValid){
         
         
         
         session.setAttribute("user", u);
         response.sendRedirect("dashboard/student.jsp");
                }
      else{
         out.println("Login UnSuccesfull");
            
           }
    %>
            