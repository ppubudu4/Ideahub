/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dea.dao;

import com.dea.bean.universityuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Achintha
 */
public class universityuserdao {
    
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
    public static int save(universityuser u)
    {
      int status=0;  
    
      try
      {
      Connection con=getConnection();
      PreparedStatement ps=con.prepareStatement("insert into university(name,password,email,contactno,location) values(?,?,?,?,?);");
      ps.setString(1, u.getName());
      ps.setString(2, u.getPassword());
      ps.setString(3, u.getEmail());
      ps.setString(4, u.getContactno());
      ps.setString(5, u.getLocation());
     
      
      status = ps.executeUpdate();
      
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return status;
      
    }
    
    
public static boolean isAutheticate(universityuser u)
{
    boolean isValid=false;
    try
    {
     Connection con=getConnection();
     PreparedStatement ps= con.prepareStatement("select * from university where name=? and password=?;");
     ps.setString(1, u.getName());
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

    

