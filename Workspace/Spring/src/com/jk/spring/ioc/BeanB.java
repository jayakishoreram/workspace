package com.jk.spring.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;



public class BeanB {
	
	static {
		System.out.println("BeanB is loaded");
	}

	public BeanB() {
		System.out.println("I am in BeanB constructor.");
	}
	
	public int getB(){
		return 30;
	}
	
	public void init(){
		System.out.println("I am in INIT of BEAN B");
	}
	
	@PostConstruct
	public void init1(){
		System.out.println("I am in INIT1 of BEAN B");
	}
	
	public void clean(){
		System.out.println("I am in CLEAN of BEAN B");
	}
	
	@PreDestroy
	public void clean1(){
		System.out.println("I am in CLEAN1 of BEAN B");
	}
	
	public BeanA getInstanceA(){
		System.out.println("BeanB.getInstanceA BEGIN");
		BeanA a = new BeanA();
		System.out.println("BeanB.getInstanceA END");
		return a;
	}
	
	public BeanB getInstanceB(){
		System.out.println("BeanB.getInstanceB BEGIN");
		BeanB b = new BeanB();
		System.out.println("BeanB.getInstanceB END");
		return b;
	}
	
}
