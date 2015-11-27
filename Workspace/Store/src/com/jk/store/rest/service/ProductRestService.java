package com.jk.store.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jk.store.entity.Product;
import com.jk.store.service.ProductService;

/*@RestController
 @RequestMapping("/Product")*/
@Component
@Path("/Products")
public class ProductRestService {

	@Autowired
	private ProductService productService;

	/* @RequestMapping("/findAll") */
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}*/
	 

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllProducts() {
		List<Product> products = productService.findAllProducts();
		GenericEntity<List<Product>> entity= new GenericEntity<List<Product>>(products){
		  };
		return Response
				.status(200)
				.entity(entity).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product findByID(@PathParam("id") long id) {
		return productService.findByID(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void saveProduct(Product product) {
		System.out.println("Saving New Product:"+product.getId());
		productService.saveProduct(product);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateProduct(Product product) throws Exception {
		productService.updateProduct(product);
	}

	@DELETE
	@Path("/{id}")
	public void deleteProduct(@PathParam("id") Long productId) {
		productService.deleteProduct(productId);
	}

	/*
	 * @POST
	 * 
	 * @Path("/deletes")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public void deleteProduct(Long[]
	 * productIds){
	 * 
	 * for(Long productId: productIds){ productService.deleteProduct(productId);
	 * }
	 * 
	 * Long id = null;
	 * 
	 * try { id = productIds.getLong(0); } catch (JSONException e) {
	 * e.printStackTrace(); }
	 * 
	 * if(null != id){ productService.deleteProduct(id); } }
	 */
}
