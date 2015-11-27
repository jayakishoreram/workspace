package com.jk.string;

public class TestString {
	static String fr_BaseDir = "Base";
	static String separator = "\\";
	public static void main(String[] args) {
	     /* String erpi_ESSBASE_Data_TempFile =
                   fr_BaseDir + separator + "tests" + separator + "files" +
                   separator + "LCM" + separator + "ERPI" +
                   separator + "temp" + separator + "System Setting.xml";
	      System.out.println(erpi_ESSBASE_Data_TempFile);
	      
	      String erpi_ESSBASE_Data_TempFile_builder = new StringBuilder(fr_BaseDir).append(separator).append("").append("").append("").append("").append("").toString();*/
		boolean x = retBool(); 
		
		if(x)
			System.out.println("TRUE: "+x);
		else
			System.out.println("null: "+x);
	}
	
	static Boolean retBool(){
		return new Boolean(true);
		//return null;
	}
	
}
