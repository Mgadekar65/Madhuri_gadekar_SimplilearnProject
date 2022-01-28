package com.assissted.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteAppend {

	public static void main(String[] args) {
//		Create and write to a file
		PrintWriter writer;
		try {
			writer = new PrintWriter(new File("some.txt"));
			writer.println("Hello World");
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("SOme issues : " + e.getMessage());
		}
		
		
//		File reading logic
		
		
		StringBuilder builder = new StringBuilder("");

		try {
			String data = "";
			
			 BufferedReader reader = new BufferedReader(new FileReader(new File("some.txt")));
			
			while((data = reader.readLine())!= null) {
				builder.append(data + "\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Some issues : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Data in the file :");
		
		System.out.println(builder);
		
		//reader.close();

		
		
	}

}

