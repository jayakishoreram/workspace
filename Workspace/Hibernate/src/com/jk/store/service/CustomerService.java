package com.jk.store.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jk.jpa.util.JPAUtil;
import com.jk.store.entity.Address;
import com.jk.store.entity.Customer;

public class CustomerService {
	
	public void saveCustomer(Customer customer){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(customer);
		
		entityManager.getTransaction().commit();
	}
	
	public Customer findByID(long id){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		Customer customer = entityManager.find(Customer.class, id);
		entityManager.getTransaction().commit();
		return customer;
	}
	
	public List<Address> findAddressByCustomerName(String name){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		String query = "SELECT AD FROM Address AD JOIN AD.customer CR WHERE CR.lastName=:LASTNAME";
		Query findAddressFromCustomer = entityManager.createQuery(query);
		findAddressFromCustomer.setParameter("LASTNAME", name);
		List<Address> addresses = findAddressFromCustomer.getResultList();
		entityManager.getTransaction().commit();
		return addresses;
	}

}
