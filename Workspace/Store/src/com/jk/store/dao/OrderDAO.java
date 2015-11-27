package com.jk.store.dao;

import org.springframework.stereotype.Repository;

import com.jk.store.entity.Order;

@Repository
public class OrderDAO extends AbstractDAO{
	
	public void saveOrder(Order order){
		entityManager.persist(order);
	}
	
	public Order findByID(long id){
		Order order = entityManager.find(Order.class, id);
		return order;
	}
	
}
