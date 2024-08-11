package com.javaDb.create;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Readusingcs {

	    public static void main(String[] args) {
	    	  String url = "jdbc:mysql://localhost:3306/ExampleDB";
		        String user = "root";
		        String password = "Pramod@1605";

	        try {
	            // Load the JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            // Establish a connection
	            Connection conn = DriverManager.getConnection(url, user, password);
	            // Prepare the callable statement
	            String callSQL = "{call GetEmployees()}";
	            CallableStatement cstmt = conn.prepareCall(callSQL);
	            // Execute the stored procedure
	            ResultSet rs = cstmt.executeQuery();
	            // Process the results
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String position = rs.getString("position");
	                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
	            }
	            // Close resources
	            rs.close();
	            cstmt.close();
	            conn.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

