package com.jk.dp;

import java.util.Random;

public class DP {
	
	public static void main(String[] args) {
		String DPTypeName  = createName("DPTYPE", 6);
		System.out.println("NAME:  "+ DPTypeName);
		String DPName  = createName("DPTYPE", 6);
		System.out.println("NAME:  "+ DPName);
		String BRName  = createName("DPTYPE", 6);
		System.out.println("NAME:  "+ BRName);
	}
	
    public static String createName(String prefix, int length) {
        prefix = (prefix == null || prefix.trim().length() == 0) ? "" : prefix;

        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";

        Random r = new Random();
        int size = charset.length();
        for (int i = 0; i < length; i++) {
            prefix += charset.charAt(r.nextInt(size));
        }
        return prefix;
    }

}
