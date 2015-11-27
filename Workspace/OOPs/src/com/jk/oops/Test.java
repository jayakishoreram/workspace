package com.jk.oops;

public class Test {

	public static void main(String[] args) {
		Box box = new Box(10,5,25);
		Box hBox = new HotBox();
		Box cBox = new ColdBox();
		System.out.println("Volume: "+ box.hashCode());
		//m1(null);
	}
	
	
	public static void m1(Test o){
		System.out.println("Obj");
	}
	
	public static void m1(String o){
		System.out.println("String");
	}
}
