package com.jk.clone;

public class TestClone {
	
	public int String;
	
	public TestClone() {
		m1(this);
		
	}
	
	public TestClone( int a) {
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
	public static void m1(TestClone clone){
		System.out.println(clone.String);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		TestClone testClone = new TestClone();
	}

}
