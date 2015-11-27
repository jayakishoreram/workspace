package com.jk.java7;

public class TestSwitch {

	public static void main(String[] args) {
		testSwich("tuesday");

	}

	
	private static  void testSwich(String swich){
		
		switch(swich){
		case "monday" : {
			System.out.println("Work day");
		}
		case "tuesday" : 
		case "wednesday":
		case "thursday":{
			System.out.println("Mid work day");
		}
		case "friday": {
			System.out.println("Weekend");
		}
		case "saturday":
		case  "sunday":{
			System.out.println("Holiday");
		}
		}
	}
}
