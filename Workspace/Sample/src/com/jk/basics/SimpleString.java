package com.jk.basics;

public class SimpleString {

	public static void main(String[] args) {
		
		String s = "JAVA";
		String s1 = "JAVA";
		String s2 = new String("JAVA");
		System.out.println(s == s1);
		System.out.println(s == s2);
		
		m1(0.0f);
	}
	
	public static void m1(float f){
		System.out.println("I am float F "+ f);
	}
	
	public static void m1(int f){
		System.out.println("I am Int I "+ f);
	}
}
