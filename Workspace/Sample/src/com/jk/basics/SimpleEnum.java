package com.jk.basics;

public class SimpleEnum {

	public static void main(String[] args) {
		AlphaEnum a = AlphaEnum.A;
		
		System.out.println(a);
		System.out.println(a.ordinal());
		for(AlphaEnum aplhaEnum: AlphaEnum.values()){
			System.out.println("ENUM: "+ aplhaEnum + "  ENUM Value: "+aplhaEnum.getValue());
			
		}
		
		int i = 120;
		for(AlphaEnum aplhaEnum: AlphaEnum.values()){
			aplhaEnum.setValue(i+=20);
			
		}
		
		for(AlphaEnum aplhaEnum: AlphaEnum.values()){
			System.out.println("ENUM: "+ aplhaEnum + "  ENUM Value: "+aplhaEnum.getValue());
			
		}

	}

}
