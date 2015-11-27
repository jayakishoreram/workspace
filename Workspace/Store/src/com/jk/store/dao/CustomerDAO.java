package com.jk.store.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jk.store.entity.Address;
import com.jk.store.entity.Customer;

@Repository
public class CustomerDAO extends AbstractDAO{
	
	@Transactional
	public void saveCustomer(Customer customer){
		entityManager.persist(customer);
	}
	
	@Transactional
	public Customer findByID(long id){
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}
	
	@Transactional
	public List<Address> findAddressByCustomerName(String name){
		String query = "SELECT AD FROM Address AD JOIN AD.customer CR WHERE CR.lastName=:LASTNAME";
		Query findAddressFromCustomer = entityManager.createQuery(query);
		findAddressFromCustomer.setParameter("LASTNAME", name);
		List<Address> addresses = findAddressFromCustomer.getResultList();
		return addresses;
	}

}
