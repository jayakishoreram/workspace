package com.jk.corejava.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	static String filePath = System.getProperty("user.dir") + File.separator + "testFile.txt";
	public static void main(String[] args) {
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current dir: "+ workingDir);
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(null != bufferedReader){
			String line = null;
			
			
			try {
				while((line = bufferedReader.readLine()) != null){
					System.out.println("Line: "+ line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
