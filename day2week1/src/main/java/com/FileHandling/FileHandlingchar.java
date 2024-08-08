package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader input=null;
		FileWriter output=null;
		
		try {
			input = new FileReader("C:\\RevatureTraining\\day5\\hello.txt");
			output=new FileWriter("C:\\RevatureTraining\\day5\\hello2.txt");
			char c;
			while((c=(char) input.read())!=-1) {
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
