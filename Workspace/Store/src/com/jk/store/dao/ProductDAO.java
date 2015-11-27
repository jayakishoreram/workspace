package com.jk.store.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jk.store.entity.Product;

@Repository
public class ProductDAO extends AbstractDAO {

	public void saveProduct(Product product) {
		entityManager.persist(product);
	}

	public void updateProduct(Product product) {
		entityManager.merge(product);
	}

	public void deleteProduct(Product product) {
		Product productRef = entityManager.find(Product.class, product.getId());
		entityManager.remove(productRef);
	}

	public Product findByID(long id) {
		Product product = entityManager.find(Product.class, id);
		return product;
	}

	public List<Product> findAll() {
		String query = "select product from Product product";
		Query jpaQuery = entityManager.createQuery(query, Product.class);
		List<Product> products = jpaQuery.getResultList();
		return products;
	}

}
