package com.jk.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jk.store.dao.CustomerDAO;
import com.jk.store.entity.Address;
import com.jk.store.entity.Customer;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	@Transactional
	public void saveCustomer(Customer customer){
		customerDAO.saveCustomer(customer);
	}
	
	@Transactional
	public Customer findByID(long id){
		Customer customer = customerDAO.findByID(id);
		return customer;
	}
	
	@Transactional
	public List<Address> findAddressByCustomerName(String name){
		return customerDAO.findAddressByCustomerName(name);
	}
	
}
