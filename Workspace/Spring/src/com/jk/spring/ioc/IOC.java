package com.jk.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//BeanA beanA =(BeanA) context.getBean("beanA");
		//System.out.println(beanA.getBeanBSet().size());
		//System.out.println(beanA.getIset().size());
		//System.out.println(beanA.getBeanB().getB());
		//BeanB beanB =(BeanB) context.getBean("beanB");
		Child child =(Child) context.getBean("child");
		System.out.println("CHILD: "+child);
	}
	
	
}
