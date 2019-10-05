<%@page import="com.dea.dao.industryuserdao" %>
    
<jsp:useBean id="u" class="com.dea.bean.industryuser"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
    boolean isValid = industryuserdao.isAutheticate(u);
     if(isValid){
         session.setAttribute("industryuser", u);
         response.sendRedirect("dashboard/industry.jsp");
                }
      else{
         out.println("Login UnSuccesfull");
            
           }
    %>
            