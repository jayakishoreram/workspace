package com.jk.store.service;

import javax.persistence.EntityManager;

import com.jk.jpa.util.JPAUtil;
import com.jk.store.entity.Address;

public class AddressService {
	
	public void saveAddress(Address address){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(address);
		
		entityManager.getTransaction().commit();
	}
	
	public Address findByID(long id){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		Address customer = entityManager.find(Address.class, id);
		entityManager.getTransaction().commit();
		return customer;
	}

}
