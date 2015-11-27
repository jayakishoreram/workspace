package com.jk.store.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jk.store.entity.Address;

@Repository
public class AddressDAO extends AbstractDAO {

	@Transactional
	public void saveAddress(Address address) {
		entityManager.persist(address);
	}

	@Transactional
	public Address findByID(long id) {
		Address customer = entityManager.find(Address.class, id);
		return customer;
	}

}
