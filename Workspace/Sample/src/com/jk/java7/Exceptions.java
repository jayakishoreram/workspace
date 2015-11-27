package com.jk.java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exceptions {

	public static void main(String[] args) {
		try {
			throwException("first1");
		} catch (FirstException e) {
			System.out.println("This is First");
		}catch (SecondException e) {
			System.out.println("This is First");
		} 
		
		
		
		List l = new ArrayList();
		l.add("String1");
		l.add("String2");
		List<Integer> intArray = null;//new ArrayList<Integer>();
		intArray = l;
		
		
		
		
		
	}
	
	public static void throwException(String eType) throws FirstException, SecondException {
		//try{
		if(eType.equals("first"))
			throw new FirstException();
		else
			throw new SecondException();
		/*}catch(Exception e){
			throw e;
		}*/
		
	}
}

class FirstException extends Exception{
	
}

class SecondException extends Exception{
	
}


