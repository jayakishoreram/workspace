package com.jk.store.service;

import javax.persistence.EntityManager;

import com.jk.jpa.util.JPAUtil;
import com.jk.store.entity.Product;

public class ProductService {
	
	public void saveProduct(Product product){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(product);
		
		entityManager.getTransaction().commit();
	}
	
	public Product findByID(long id){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		Product product = entityManager.find(Product.class, id);
		entityManager.getTransaction().commit();
		return product;
	}
	
}
