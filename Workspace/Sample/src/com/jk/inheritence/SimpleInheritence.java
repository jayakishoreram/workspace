package com.jk.inheritence;

public class SimpleInheritence {

	public static void main(String[] args) {
		Sub1 sub = new Sub1();
		/*System.out.println(sub.subIMethod());
		System.out.println(sub.subIMethod1());*/
		System.out.println(sub.subSMethod());
		System.out.println(sub.subSMethod1());
	}
}


class Super1{
	
	int a = 10;
	static int x = 10;
	
	static{
		System.out.println("I am in super Static");
	}
	
	{
		System.out.println("I am in SUPER Instance block");
	}
	
	Super1(){
		System.out.println("I am in SUPER constructor.");
	}
	
	
}

class Sub1 extends Super1{
	
	int a = 20;
	static int x = 20;
	static{
		System.out.println("I am in Sub Static");
	}
	
	{
		System.out.println("I am in Sub Instance block");
	}
	
	Sub1(){
		System.out.println("I am in Sub constructor.");
	}
	
	public int subIMethod(){
		return a;
	}
	
	public int subIMethod1(){
		return super.a;
	}
	public static int subSMethod(){
		return x;
	}
	
	public int subSMethod1(){
		return super.x;
	}
}
