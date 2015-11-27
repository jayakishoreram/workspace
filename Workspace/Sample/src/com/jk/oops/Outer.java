package com.jk.oops;

public class Outer {

	public static void main() {
		Outer.Inner inner = new Outer().new Inner();
//		Outer.Inner inner2 = new Outer.Inner();
		Outer.StaticInner inner1 = new Outer.StaticInner();
		Outer.OI oi= new Outer.OI() {
		};
//		Inner inner3 = new Inner();
		
		
		
		
		
		//static local class
		
		class StaticInner1{
		   // interface OIII{}
			public void sm1(){}
			public int a1 = 10;
			public final int a2 = 10;
	}
		
		
		
	}
	
	public void AAA(){
		
		class StaticInner1{
			   // interface OIII{}
				public void sm1(){}
				public int a1 = 10;
				public final int a2 = 10;
		}
	}
	
	static class StaticInner{
		    interface OII{}
			public static void sm(){}
			public static int a = 10;
	}
	class Inner{
	//	interface OII{}
		//public static void sm(){}
		public final static int a = 10;
	}
	
	
	interface OI{}
}
