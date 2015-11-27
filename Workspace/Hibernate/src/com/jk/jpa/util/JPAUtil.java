package com.jk.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;
	static{
		
		entityManagerFactory = Persistence.createEntityManagerFactory("store");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public static EntityManager getEntityManager(){
		return entityManager;
	}
	
}
