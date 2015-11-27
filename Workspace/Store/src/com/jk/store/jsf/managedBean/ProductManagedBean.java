package com.jk.store.jsf.managedBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jk.store.entity.Product;
import com.jk.store.service.ProductService;

public class ProductManagedBean {

	List<Product> products = null;
	
	private Product product = new Product();

	private ProductService produtService;
	
	private Map<Long, Boolean> selectedProductIds = new HashMap<Long, Boolean>();

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String saveProduct() {
		System.out.println("Product ID: "+ product.getId());
		if(null != product.getId()){
			produtService.updateProduct(product);
		}else{
			produtService.saveProduct(product);
			getAllProducts();
		}
		product = new Product();
		return "Products";
	}

	public String reset() {
		resetProduct();
		return "";
	}
	
	public String cancel() {
		return "Products";
	}
	
	public String getAllProducts(){
		products = produtService.findAllProducts();
		if(null != products){
			System.out.println("Products size: "+ products.size());
		}
		return "Products";
	}
	
	private void resetProduct() {
		System.out.println("Product: "+ product);
		if (null == product) {
			product = new Product();
		} else {
			product.setName("");
			product.setDescription("");
			product.setPrice(0.0);
			product.setQuantity(0);
			product.setRating(0);
		}
	}

	public String initProduct(Product product){
		this.product = product;
		System.out.println("Product ID: "+ product.getId());
		return "EditProduct";
	}
	
	public String deleteProducts(){
		System.out.println("Select products for delete: "+ selectedProductIds.size());
		List<Product> productListToDelete = new ArrayList<Product>();
		for(Product product:products){
			if(selectedProductIds.get(product.getId())){
				productListToDelete.add(product);
			}
		}
		
		System.out.println("Products length: "+ productListToDelete.size());
		
		produtService.deleteProduct(productListToDelete);
		getAllProducts();
		
		return "Products";
	}
	public ProductService getProdutService() {
		return produtService;
	}

	public void setProdutService(ProductService produtService) {
		this.produtService = produtService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Map<Long, Boolean> getSelectedProductIds() {
		return selectedProductIds;
	}

	public void setSelectedProductIds(Map<Long, Boolean> selectedProductIds) {
		this.selectedProductIds = selectedProductIds;
	}
}
