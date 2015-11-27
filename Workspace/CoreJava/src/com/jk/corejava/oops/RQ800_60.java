package com.jk.corejava.oops;

public class RQ800_60 {
	static void printFirst(Integer... ints) {
		System.out.println("Integer...: " + ints[0]);
	}

	static void printFirst(Number... nums) {
		System.out.println("Number...: " + nums[0]);
	}

	static void printFirst(Object... objs) {
		System.out.println("Object...: " + objs[0]);
	}

	public static void main(String[] args) {
		printFirst(10);
		printFirst((byte) 20);
		printFirst('3', '0');
		printFirst("40");
		printFirst((short) 50, 55);
		printFirst((Number[]) new Integer[] { 70, 75 });
	}
}