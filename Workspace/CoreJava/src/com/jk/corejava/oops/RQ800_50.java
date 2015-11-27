package com.jk.corejava.oops;

public class RQ800_50 {
	public static void main(String[] args) {
		YingYang1 yy = new YingYang1();
		yy.yingyang(10);
		//yy.yingyang(10, 12);
		yy.yingyang(new Integer[] { 10, 20 });
		yy.yingyang(new Integer(10), new Integer(20));
	}
}

class YingYang1 {
	void yingyang(Integer i) {
		System.out.println("Integer: " + i);
	}

	/*void yingyang(Integer[] ints) {
		System.out.println("Integer[]: " + ints[0]);
	}*/

	void yingyang(Integer... ints) {
		System.out.println("Integer...: " + ints[0]);
	}
}
