package com.FileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileHandlingByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream input;
		FileOutputStream output;
		
		try {
			input = new FileInputStream("C:\\RevatureTraining\\day5\\hello.txt");
			output = new FileOutputStream("C:\\RevatureTraining\\day5\\hello2.txt");
			int c;
			while((c=input.read())!=-1) {
				output.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
