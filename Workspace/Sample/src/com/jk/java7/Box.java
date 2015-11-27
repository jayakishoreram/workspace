package com.jk.java7;

public class Box<T> {
	
	T t;
	
	public <U> void add(U u){
		if(u instanceof String){
			//dxfgdfh
		}
	}
	
	public static void main(String[] args) {
		new Box<Integer>().<String>add("String");
	}

}
