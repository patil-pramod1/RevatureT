package com.javaDb.create;
import java.sql.*;


public class CreaateDb {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ExampleDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Pramod@1605";

    public static void main(String[] args) {
    	Connection connection=null;
    	Statement st=null;
    	ResultSet rs=null;
    	

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            st=connection.createStatement();
            String sql1="select * from contacts";
            rs=st.executeQuery(sql1);
            while(rs.next()) {
    			System.out.println(rs.getInt("id")+" , "+
    					rs.getString(2)+" , "+rs.getString("email")+" , "+rs.getString("phone"));
    		}
    		
    		// step 6 - Close the connection
    		connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
            return;
        }

        // Establish connection and execute SQL statement
          }
}
