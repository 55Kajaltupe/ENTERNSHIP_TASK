package com.google;
import java.sql.*;
public class dropDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false", "root", "vaibhu");

            Statement stmt = con.createStatement();
            String rs = "drop database testdb;";
            stmt.executeUpdate(rs);
            System.out.println("Database deleted successfully");
            con.close();
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}
