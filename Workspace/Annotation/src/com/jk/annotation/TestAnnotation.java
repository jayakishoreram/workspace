package com.jk.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) {
		Class<AnnotationClass> clazz = AnnotationClass.class;
		Annotation[] annotationArray = clazz.getDeclaredAnnotations();
		for(Annotation anno:annotationArray)
			System.out.println("Annotation: "+ anno);
		
		if(clazz.isAnnotationPresent(ClassAnnotation.class)){
			
			
			Method[] methods = clazz.getMethods();
			for(Method method:methods){
				System.out.println("Method: "+ method);
				Annotation[] annotations = method.getAnnotations();
				for(Annotation anno: annotations){
					System.out.println("Method level Annotation :"+ anno);
				}
				if(method.isAnnotationPresent(MethodAnnotation.class)){
					System.out.println("annotated method: "+method);
					try {
						clazz.newInstance().methodAnnotated();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		}

	}

}
