package com.jk.corejava.oops;

public class RQ800_80 {
	static String compute(long... ls) {
		return "ONE";
	}

	static String compute(Long... ls) {
		return "TWO";
	}

	static String compute(Integer i1, Integer i2) {
		return "THREE";
	}

	static String compute(Long l1, Long l2) {
		return "FOUR";
	}

	static String compute(Number n1, Number n2) {
		return "FIVE";
	}

	public static void main(String[] args) {
		System.out
				.println(compute((byte) 5, (byte) 10) + ", " + compute(5, 10));
		System.out.println(compute(5L, 10) + ", " + compute(5L, 10L));
	}
}