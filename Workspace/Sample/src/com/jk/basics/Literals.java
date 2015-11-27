package com.jk.basics;


public class Literals {

	public static void main(String[] args) {
		
		int i = 0b1111;
		
		byte b = 0b1111;
		
		long l = 0b1111;
		
		float f = 0b1111;
		
		double d = 0b1111;
		
		System.out.println(i);
		System.out.println(b);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("HEXA DECIMAL");
		byte hexb = 0x002f;
		int hexI = 0xfff;
		
		System.out.println(hexb);
		System.out.println(hexI);
		
		
		System.out.println("OCTA DECIMAL");
		
		byte octB = 0111;
		int octI = 01000;
		System.out.println(octB);
		System.out.println(octI);
		
		int c = 'a';
		
		System.out.println(c);
	}

}
