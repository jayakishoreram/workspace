package com.ade;

public class MyTest {
	static int i=1;
	
	public static void main(String[] args) {
		/*System.out.println(getVaue());
		
		
		System.out.println(i);*/
		
		String s = "Red;Blue;green";
		String[] ary = s.split(";");
		for(String at: ary)
			System.out.println(at);
	}
	
	public static  int getVaue(){
		try{
			i = i+1;
			return i;
		}catch(Exception e){
			return 0;
		}finally{
			i =i+1;		}
	}

}
