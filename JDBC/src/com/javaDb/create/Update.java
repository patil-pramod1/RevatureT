package com.javaDb.create;
import java.sql.*;
public class Update {

	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ExampleDB";
	    private static final String JDBC_USERNAME = "root";
	    private static final String JDBC_PASSWORD = "Pramod@1605";

	    public static void main(String[] args) {
	        // SQL statement for updating a record in the contacts table
	        String sqlUpdate = "UPDATE contacts SET fullname = ?, email = ?, phone = ? WHERE id = ?";
	        
	        // Data to be updated
	        int id = 4;
	        String fullname = "Naveen";
	        String email = "narayan1605@gmail.com";
	        String phone = "9984139762";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (Exception e) {
	            System.out.println("No Driver found");
	            e.printStackTrace();
	            return;
	        }

	        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
	             PreparedStatement ps = connection.prepareStatement(sqlUpdate)) {
	             
	            // Setting the parameters for the update statement
	            ps.setString(1, fullname);
	            ps.setString(2, email);
	            ps.setString(3, phone);
	            ps.setInt(4, id);

	            // Executing the update
	            int updatedRows = ps.executeUpdate();
	            if (updatedRows > 0) {
	                System.out.println("Update is successful");
	            } else {
	                System.out.println("No record found with the provided ID");
	            }
	        } catch (SQLException e) {
	            System.out.println("No connection established");
	            e.printStackTrace();
	            return;
	        }
	    }
	}


