package com.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
 
public class Ref {
	public static void main(String... args){
		ReferenceQueue rq= new ReferenceQueue(); 
		String s="hello";
		Reference r= new PhantomReference(s,rq); 
		//s=null;
		//System.gc();	
		System.out.println(rq.poll());
	}
}