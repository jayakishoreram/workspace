package com.jk.basics;

public enum AlphaEnum {

	A(100),B(200),C(300),D(300);
	
	private int value;
	
	AlphaEnum(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
}
