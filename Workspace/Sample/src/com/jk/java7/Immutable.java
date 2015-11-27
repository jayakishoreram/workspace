package com.jk.java7;

public class Immutable extends m1 {

	int a = 20;
	public static void main(String[] args) {
		Immutable immutable = new Immutable();
		System.out.println(immutable.a);
	}
}


class m1{
	final int a = 10;
	void m1(){
		
	}
}