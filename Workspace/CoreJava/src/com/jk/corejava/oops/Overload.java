package com.jk.corejava.oops;

class YingYang {
	void yingyang(Integer i) {
		System.out.println("Integer: " + i);
	}
	
	/*void yingyang(Integer i, Integer j) {
		System.out.println("Integer: " + i);
	}*/

	void yingyang(int[] ints) {
		System.out.println("Integer[]: " + ints[0]);
	}

	void yingyang(Integer... ints) {
		System.out.println("Integer...: " + ints[0]);
	}
	
	void foo(int a){System.out.println("int");}
	void foo(Integer a){System.out.println("Integer");}
}

public class Overload {
	public static void main(String[] args) {
		YingYang yy = new YingYang();
		//yy.yingyang(10);
		//yy.yingyang(10, 12);
yy.yingyang(new int[] { 10, 20 });
		//yy.yingyang(new Integer(10), new Integer(20));
		//yy.foo((Integer)10);
	}
}
