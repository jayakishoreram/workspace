package com.jk.spring.ioc;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	static {
		System.out.println("BeanA is loaded");
	}
	
	
	private BeanB beanB = null;
	
	@Autowired  //@Lazy(value = true)
	private Set<I> iset = null;
	
	@Autowired  //@Lazy(value = true)
	private Set<BeanB> beanBSet = null;
	
	public BeanA() {
		System.out.println("I am in BeanA NO arg constructor.");
	}
	
	
	public BeanA(BeanB beanB) {
		System.out.println("I am in BeanA Arg constructor.");
		this.beanB = beanB;
	}
	
	public BeanB getBeanB() {
		return beanB;
	}
	
	@Autowired(required = false) //@Lazy(value = true)
	public void setBeanB(@Qualifier("beanB1") BeanB beanB) {
		this.beanB = beanB;
	}
	
	
	public Set<BeanB> getBeanBSet() {
		return beanBSet;
	}


	public void setBeanBSet(Set<BeanB> beanBSet) {
		this.beanBSet = beanBSet;
	}


	public Set<I> getIset() {
		return iset;
	}

	public void setIset(Set<I> iset) {
		this.iset = iset;
	}

	
	
	public void init(){
		System.out.println("I am in INIT of BEAN A");
	}
	
	@PostConstruct
	public void init1(){
		System.out.println("I am in INIT1 of BEAN A");
	}
	
	
	public void clean(){
		System.out.println("I am in CLEAN of BEAN A");
	}
	
	@PreDestroy
	public void clean1(){
		System.out.println("I am in CLEAN1 of BEAN A");
	}
	
	public static BeanA getInstanceA(){
		System.out.println("BeanA.getInstanceA BEGIN");
		BeanA a = new BeanA();
		System.out.println("BeanA.getInstanceA END");
		return a;
	}
	
	public static BeanB getInstanceB(){
		System.out.println("BeanA.getInstanceB BEGIN");
		BeanB b = new BeanB();
		System.out.println("BeanA.getInstanceB END");
		return b;
	}
}
