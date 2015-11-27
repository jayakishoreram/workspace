package com.jk.excep;

public class Exp {

	public static void main(String[] args) {
		try{
			throwException();
		}catch(Exception e){
			if(e.getMessage().equals("exp Msg")){
				System.out.println("HUREEEEEEEEEEEEEEEE");
			}
		}
	}
	
	private static void throwException() throws Exception{
		throw new Exception("exp Msg");
	}
}
