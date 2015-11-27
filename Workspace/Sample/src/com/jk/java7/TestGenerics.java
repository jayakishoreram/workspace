package com.jk.java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {
	
	public static void main(String[] args) {
		
//		List<Integer> intList = new ArrayList<>();
		List objList = new ArrayList();
		objList.add("10");
		objList.add(10);
		//intList = objList;
			
		//intList.add("10");
		
		/*objList = intList;
		
		objList.add("20");*/
		
		
		List<Integer> intList1 = Arrays.asList(1,2,3); 
		
		sum(intList1);
	}

	public static <T  extends Number> void sum(List<T> numList){
		System.out.println("num list");
	}
	
	public static void add(List<? super Number> numList){
		//numList.add(new Integer(10));
		//numList.add("");
	}
	
	public static <T> void minus(T t){
		
	}
}
