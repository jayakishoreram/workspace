package com.jk.CL;

public class BeanB {
	
	static {
		System.out.println("BeanB is loaded");
	}

	public BeanB() {
		System.out.println("I am in BeanB constructor.");
	}
	
	public int getB(){
		return 30;
	}
}
