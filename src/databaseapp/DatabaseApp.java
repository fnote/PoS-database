/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseapp;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseApp {
    
     public static student stud=new student();
    
    //public static student student1;
    
    public static DataForm data;
    
    private static PreparedStatement stmt;

   
    public static void main(String[] args) throws Exception {
        
        //private static student stu;
        DataForm gui = new DataForm();
        gui.setVisible(true);
        
        
        
        
       }   
    
    
    public void database_part() throws Exception{
        
        System.out.println("blowjob");
         Connection con = null;
        stmt = null;
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
         Statement stats=(Statement) con.createStatement();
         
         
         String sql="insert into student"+"(age,name)"+"values(?,?)";
         
         PreparedStatement stmt= con.prepareStatement(sql);
         
        // String sql="insert into student"+"(age,name)"+"values(?,?)";
         System.out.println("lol");
         System.out.println("me");
         
         String named=stud.getName();
         int ages=stud.getAge();
         
         System.out.println(named);
         
         
         
         System.out.println("");
          stmt.setInt(1,ages);
          stmt.setString(2,named);
         
         
         
         stmt.executeUpdate();
         
         //getting data from database
         
        String query = "select * from student";
        ResultSet rs =  stats.executeQuery(query);
        System.out.println("age	Name    ");
        while (rs.next()) {
           int age = rs.getInt("age");
           String name = rs.getString("name");
         
           System.out.println(age + "  " + name+"   ");
           
           
        
    }
    
         //System.out.println(stud.getName());
    }
}
