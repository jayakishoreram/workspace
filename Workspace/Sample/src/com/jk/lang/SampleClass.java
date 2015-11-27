package com.jk.lang;

public class SampleClass {

	public static void main(String[] args) {
		
		new SampleClass().getClass1();
	}
	
	public void getClass1(){
		
		Class clas = this.getClass();
		System.out.println(clas.getClassLoader());
		
	}
}
