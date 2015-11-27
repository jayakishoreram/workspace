package com.jk.clone;

public class TestCloneConstructor {
	
	public static void main(String[] args)throws CloneNotSupportedException {
		CloneImpl impl = new TestCloneConstructor().new CloneImpl();
		impl.a = 30;
		System.out.println("Before clone");
		CloneImpl impl2 = (CloneImpl)impl.clone();
		System.out.println(impl2.a);
		
	}
	
	public static final void m1(){}
	
	protected class CloneImpl implements Cloneable{
		
		public int a = 10;
		
		public CloneImpl() throws CloneNotSupportedException {
			System.out.println("In Constructor");
			a = 20;
		}
		
		public Object clone() throws CloneNotSupportedException{
			
			return super.clone();
		}
		
	}
	
	
}

