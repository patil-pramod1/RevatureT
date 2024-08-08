package com.javaDb.create;
import java.sql.*;


public class CreaateDb {
    // JDBC URL, user  name, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ExampleDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Pramod@1605";

    public static void main(String[] args) {
        // SQL INSERT statement
        String sqlInsert = "INSERT INTO users (username, email,phone) VALUES (?, ?,?)";

        // Data to be inserted
        String username = "pramod Patil";
        String email = "pramodp1605@gmail.com";
        String phone="9901536522";

        // Load MySQL JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
            return;
        }

        // Establish connection and execute SQL statement
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)) {
            // Set parameters for the SQL statement
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);

            // Execute the SQL statement
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting data.");
            e.printStackTrace();
        }
    }
}
