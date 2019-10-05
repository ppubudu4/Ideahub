/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dea.dao;

import com.dea.bean.adminuser;
import com.dea.bean.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Achintha
 */
public class adminuserdao {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



   public static Connection getConnection()
   {
    Connection con=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dea","root","");
    }
    catch(Exception e){
        System.out.println(e);
    }
   return con;
    
   }
    public static int save(adminuser u)
    {
      int status=0;  
    
      try
      {
      Connection con=getConnection();
      PreparedStatement ps=con.prepareStatement("insert into admin(username,password,name,email,contactno) values(?,?,?,?,?);");
      ps.setString(1, u.getUsername());
      ps.setString(2, u.getPassword());
      ps.setString(3, u.getName());
      ps.setString(4, u.getEmail());
      ps.setString(5, u.getContactno());
      
      
      status = ps.executeUpdate();
      
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return status;
      
    }
    
    
public static boolean isAutheticate(adminuser u)
{
    boolean isValid=false;
    try
    {
     Connection con=getConnection();
     PreparedStatement ps= con.prepareStatement("select * from admin where username=? and password=?;");
     ps.setString(1, u.getUsername());
     ps.setString(2, u.getPassword());
     ResultSet rs=ps.executeQuery();
     isValid = rs.next();
     
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
    return isValid;
}
    
   
    
    
}


