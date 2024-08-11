package com.javaDb.create;
import java.sql.*;
public class Delete {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ExampleDB";
	    private static final String JDBC_USERNAME = "root";
	    private static final String JDBC_PASSWORD = "Pramod@1605";

	    public static void main(String[] args) {
	        // SQL statement for deleting a record from the contacts table
	        String sqlDelete = "DELETE FROM contacts WHERE id = ?";
	        
	        // ID of the record to be deleted
	        int id = 4;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (Exception e) {
	            System.out.println("No Driver found");
	            e.printStackTrace();
	            return;
	        }

	        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
	             PreparedStatement ps = connection.prepareStatement(sqlDelete)) {
	             
	            // Setting the ID parameter for the delete statement
	            ps.setInt(1, id);

	            // Executing the delete operation
	            int deletedRows = ps.executeUpdate();
	            if (deletedRows > 0) {
	                System.out.println("Deletion is successful");
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

