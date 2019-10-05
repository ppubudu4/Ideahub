/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dea.dao;

/**
 *
 * @author Achintha
 */

import com.dea.bean.*;
import java.sql.*;
public class userDao {
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
    public static int save(user u)
    {
      int status=0;  
    
      try
      {
      Connection con=getConnection();
      PreparedStatement ps=con.prepareStatement("insert into student(username,password,NIC,name,degree,university,email,contactno) values(?,?,?,?,?,?,?,?);");
      ps.setString(1, u.getUsername());
      ps.setString(2, u.getPassword());
      ps.setString(3, u.getNIC());
      ps.setString(4, u.getName());
      ps.setString(5, u.getDegree());
      ps.setString(6, u.getUniversity());
      ps.setString(7, u.getEmail());
      ps.setString(8, u.getContactno());
      
      status = ps.executeUpdate();
      
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return status;
      
    }
    
    
public static boolean isAutheticate(user u)
{
    boolean isValid=false;
    try
    {
     Connection con=getConnection();
     PreparedStatement ps= con.prepareStatement("select * from student where username=? and password=?;");
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
