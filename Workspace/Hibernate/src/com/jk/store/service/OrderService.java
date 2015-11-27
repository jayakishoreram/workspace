package com.jk.store.service;

import javax.persistence.EntityManager;

import com.jk.jpa.util.JPAUtil;
import com.jk.store.entity.Order;

public class OrderService {
	
	public void saveOrder(Order order){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(order);
		entityManager.getTransaction().commit();
	}
	
	public Order findByID(long id){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		Order order = entityManager.find(Order.class, id);
		entityManager.getTransaction().commit();
		return order;
	}
	
}
