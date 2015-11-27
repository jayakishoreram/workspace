package com.jk.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jk.store.dao.AddressDAO;
import com.jk.store.entity.Address;

@Service
@Transactional
public class AddressService {

	@Autowired
	private AddressDAO addressDAO;

	public AddressDAO getAddressDAO() {
		return addressDAO;
	}

	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}
	
	@Transactional
	public void saveAddress(Address address) {
		addressDAO.saveAddress(address);
	}

	@Transactional
	public Address findByID(long id) {
		Address customer = addressDAO.findByID(id);
		return customer;
	}

}
