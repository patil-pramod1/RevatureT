package com.javaDb.create;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Updateusingcs {

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
	            String callSQL = "{call UpdateEmployeePosition(?, ?)}";
	            CallableStatement cstmt = conn.prepareCall(callSQL);
	            cstmt.setInt(1, 1); // Assuming ID is 1
	            cstmt.setString(2, "Senior Engineer");
	            // Execute the stored procedure
	            cstmt.executeUpdate();
	            System.out.println("Employee position updated successfully.");
	            // Close resources
	            cstmt.close();
	            conn.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

