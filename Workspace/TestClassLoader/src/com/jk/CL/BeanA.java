package com.jk.CL;

public class BeanA {
	static {
		System.out.println("BeanA is loaded");
	}
	
	public BeanA() {
		System.out.println("I am in BeanA NO arg constructor.");
	}
	
	public BeanA(BeanB beanB) {
		this.beanB = beanB;
		System.out.println("I am in BeanA ARG constructor.");
	}
	private BeanB beanB;
	
	public int getA(){
		return 20;
	}
	
	public int getB(){
		return beanB.getB();
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
		
}
