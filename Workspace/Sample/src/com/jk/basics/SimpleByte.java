package com.jk.basics;

public class SimpleByte {

	public static void main(String[] args) {
		
		byte a = 10;
		
		byte x = (byte)(a + 20);
		
		byte b = a;

		char c = 100;
		
		char c1 = 'a';
		
		System.out.println(c + "" + c1);
		
		String s = "I am a big string";
		
		char[] sChars = s.toCharArray();
		
		for(char ch : sChars)
			System.out.print(ch);
		
		String s1 = new String(sChars);
		
		System.out.println("S1: "+ s1);
	}
}
