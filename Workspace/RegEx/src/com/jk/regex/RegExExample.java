package com.jk.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
	
	
	private static String regEx = "[a-zA-Z0-9._]*@[a-zA-Z0-9.]*.com$";
	private static String macher = "jk@gmail.com";
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(regEx);
		
		Matcher matcher = pattern.matcher(macher);
		
		boolean found = false;
        while (matcher.find()) {
            System.out.format("I found the text" +
                " \"%s\" starting at " +
                "index %d and ending at index %d.%n",
                matcher.group(),
                matcher.start(),
                matcher.end());
            found = true;
        }
        if(!found){
        	System.out.format("No match found.%n");
        }
		
	}

}
