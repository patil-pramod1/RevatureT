package com.FileHandling;
import java.io.*;

public class FileHandlingRAF {

	

	
	    public static void main(String[] args) {
	        try {
	            // Create a new random access file
	            RandomAccessFile file = new RandomAccessFile("C:\\RevatureTraining\\day5\\hello1.txt", "rw");
	            
	            // Write data to the file
	            
	            file.writeUTF("Hello, World!");
	            System.out.println("String: ");
	            file.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

}
