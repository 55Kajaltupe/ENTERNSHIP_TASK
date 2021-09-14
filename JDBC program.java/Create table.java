package com.google;
import java.sql.*;
public class createTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false","root","vaibhu");

            Statement stmt=con.createStatement();
            String rs="create table student(roll int(3),name varchar(100))";
            stmt.executeUpdate(rs);
            System.out.println("table is  created successfully...");
            con.close();
        }
        catch(Exception e)
        { System.out.println(e);
        }
    }

}
