package com.jk.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jk.store.dao.ProductDAO;
import com.jk.store.entity.Product;

@Service(value="productService")
@Transactional
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	public void saveProduct(Product product){
		productDAO.saveProduct(product);
	}
	
	public void updateProduct(Product product){
		productDAO.updateProduct(product);
	}
	
	public void deleteProduct(List<Product> products){
		for(Product product:products){
			productDAO.deleteProduct(product);
		}
	}
	
	public Product findByID(long id){
		Product product = productDAO.findByID(id);
		return product;
	}
	
	public List<Product> findAllProducts(){
		return productDAO.findAll();
	}
	
	public void deleteProduct(Long id){
		Product product = productDAO.findByID(id);
		productDAO.deleteProduct(product);
	}
}
