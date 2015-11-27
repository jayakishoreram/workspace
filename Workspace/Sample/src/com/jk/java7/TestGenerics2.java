package com.jk.java7;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics2 {

	public static void main(String[] args) {
		List<? extends A> aList = new ArrayList<B>();
//		ArrayList<B> bb = new ArrayList<>();
		/*bb.add(new B());
		aList = bb;*/
		//List<? extends A> aList = new ArrayList<A>();
		//aList.add(new B());
		//aList.add(new A());
		
		
		/*List<A> bList = new ArrayList<>();
		bList.add(new B());
		bList.add(new A());*/
		
		
	}

}

class A{}
class B extends A{}
class C {}
