package com.jk.corejava.oops;

public class RQ200_10 {
	public static void main(String[] args) {
		Integer iRef;
		iRef = 786; // (1)
		iRef = (Integer) (2007 - 786); // (2)
		iRef = (int) 3.14; // (3)
		//iRef = (Integer) 3.14; // (4)
		iRef = (Integer) (int) 3.14; //
		
		int a = (int)new Integer(0);
		
		//if(a == null){}
	}
}
