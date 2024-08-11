package com.javaDb.create;
import java.sql.*;
public class PracticeJdbc {
	private static final String JDBC_URL ="jdbc:mysql://localhost:3306/ExampleDB";
	private static final String JDBC_USERNAME="root";
	private static final String JDBC_PASSWORD="Pramod@1605";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sqlInsert = "INSERT INTO contacts (id,fullname,email,phone) values (?,?,?,?)";
		int id=4;
		String fullname="narayan";
		String email="narayan1605@gmail.com";
		String phone="9984139762";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 System.out.println("No Driver find");
			 e.printStackTrace();
			 return;
		 }
		 try(Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
			 PreparedStatement ps = connection.prepareStatement(sqlInsert)){
			 ps.setInt(1, id);
			 ps.setString(2, fullname);
			 ps.setString(3, email);
			 ps.setString(4, phone);
			 int insertedrow =ps.executeUpdate();
			 if(insertedrow>0) {
				 System.out.println("Insertion is sucessfull");
			 }
		 }catch(SQLException e) {
			 System.out.println("No connection established");
			 e.printStackTrace();
			 return;
		 }

	}

}