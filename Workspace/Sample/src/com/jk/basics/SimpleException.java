package com.jk.basics;

public class SimpleException {

	private static int i = 10;
	public static void main(String[] args) {
		System.out.println(m1());
		System.out.println("I: "+i);
	}
	
	public static int m1(){
		try{
			System.out.println("********************1");
			i++;
			System.out.println("********************2");
			if(i == 11)
				throw new RuntimeException();
			return i;
			
		}catch(Exception e){
			
		}finally{
			System.out.println("********************3");
			i++;
			//return i;
		}
		System.out.println("********************4");
		return i;
	}
	
}
