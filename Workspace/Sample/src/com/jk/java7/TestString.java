package com.jk.java7;

public class TestString {

	public static void main(String[] args) {
		String s = "";
		for(char i='A'; i<'z';i++){
			s = s + i;
		}
		
		for(char i='A'; i<'z';i++){
			s = s + i;
		}
		
		
		System.out.println("String: "+ s);
		//System.out.println("abc: "+ s.lastIndexOf("abc"));
		//System.out.println("abc: "+ s.lastIndexOf("abc", 70));
		System.out.println("String intern : "+ s.intern());
		System.out.println("String equals : "+ s.intern().equals(s));
		
	}
}
