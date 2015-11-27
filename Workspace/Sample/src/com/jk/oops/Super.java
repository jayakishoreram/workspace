package com.jk.oops;
public class Super{
	public static int a = 10;
	public  void m1(){
		
		System.out.println("SUPER");
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Sub.a);
		
		Super super1 = new Super();
		Sub sub = new Sub();
		
		//super1 = sub;
		sub = (Sub)super1;
		
		sub.m1();
		
		//int i = ++(--a)
		int j = 20;
		
		//for(int i=0; i<20 && j+=20;i++, j++);
	}
}

class Sub extends Super{
	public int a = 20;
	public  void m1(){
		System.out.println("SUB");
	}
}