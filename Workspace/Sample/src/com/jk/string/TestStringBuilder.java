package com.jk.string;

public class TestStringBuilder {
	static String strG = "";
	public static void main(String[] args) {
		
		String str = new String("ABC");
		StringBuilder buffer = new StringBuilder("");
		appendString(str);
		System.out.println("STR: "+ strG);
	}
	
	private static void appendString(String strg){
		strG = "XYZ";
	}
}
