<%@page import="com.dea.dao.universityuserdao" %>
    
<jsp:useBean id="u" class="com.dea.bean.universityuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
    boolean isValid = universityuserdao.isAutheticate(u);
     if(isValid){
         session.setAttribute("universityuser", u);
         response.sendRedirect("dashboard/university.jsp");
                }
     
      else{
         out.println("Login UnSuccesfull");
            
           }
    %>
            