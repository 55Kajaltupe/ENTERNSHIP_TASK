package com.google;
import java.sql.*;
public class fetchData {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false", "root", "vaibhu");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student"); 

                while(rs.next()){
                 
                    System.out.println("Roll no.: " + rs.getInt("roll"));
                    System.out.println("Name: " + rs.getString("name"));

                }
            con.close();
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}
