package com.jk.corejava.oops;

public class Overload1 {

	public static void main(String[] args) {
		//m1(null);
		//m1('A');
		/*m1((String)null);
		m1(new A());
		m1(new B());
		m1(new C());*/
		
		
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		/*m1(a1);
		m1(b1);
		m1(c1);*/
		
		
		/*Overload1 o1 = new Overload1();
		o1.m((String)null);
		o1.m(a1);
		o1.m(b1);
		o1.m(c1);*/
		
		//b1 = (B)a1;
		
		//System.out.println(b1 instanceof A);
		
	}
	
	private static void m1(String s){
		System.out.println("String arg");
	}

	private static void m1(Object o){
		System.out.println("Object arg");
	}
	
	private static void m1(A a){
		System.out.println("A arg");
	}
	
	private static void m1(B b){
		System.out.println("B arg");
	}
	
	private void m(String s){
		System.out.println("String arg");
	}

	private void m(Object o){
		System.out.println("Object arg");
	}
	
	private void m(A a){
		System.out.println("A arg");
	}
	
	private void m(B b){
		System.out.println("B arg");
	}

}


class A{}

class B extends A{}

class C{}

