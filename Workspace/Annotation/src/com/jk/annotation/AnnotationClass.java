package com.jk.annotation;

@ClassAnnotation
public class AnnotationClass {
	
	@MethodAnnotation
	public static void methodAnnotated(){
		System.out.println("In annotated method");
	}

}
