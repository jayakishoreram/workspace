package com.jk.store.client;

import java.util.Date;
import java.util.List;

import com.jk.store.dao.AddressDAO;
import com.jk.store.dao.CustomerDAO;
import com.jk.store.dao.OrderDAO;
import com.jk.store.dao.ProductDAO;
import com.jk.store.entity.Address;
import com.jk.store.entity.Customer;
import com.jk.store.entity.Order;
import com.jk.store.entity.OrderItem;
import com.jk.store.entity.Product;

public class StoreClient {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.setFirstName("Jack");
		customer.setLastName("Sparrow");
		customer.setEmail("jacksparrow@email.com");
		customer.setPhone("9986712345");
		customer.setLoginId("jacksparrow@email.com");
		customer.setPassword("Jack12345");

		CustomerDAO customerService = new CustomerDAO();

		customerService.saveCustomer(customer);
		
		
		Address address = new Address();
		
		address.setLine1("#986/23, 24 th cross, F lane");
		address.setLine2("Behind Munnswara layout, ejipura.");
		address.setCity("Bengalore");
		address.setState("Karnataka");
		address.setPincode(560047);
		address.setCustomer(customer);
		AddressDAO addressService = new AddressDAO();
		
		addressService.saveAddress(address);
		
		Address address2 = new Address();
		
		address2.setLine1("#6/23, Oracle india pvt ltd");
		address2.setLine2("Jayanagar 7 block, kalyani magmum");
		address2.setCity("Bengalore");
		address2.setState("Karnataka");
		address2.setPincode(560048);
		
		address2.setCustomer(customer);
		addressService.saveAddress(address2);
		
		
		List<Address> customerAddress = customerService.findAddressByCustomerName("Sparrow");
		
		System.out.println(customerAddress.size());
		
		//Product
		
		Product product = new Product();
		
		product.setName("Colgate tooth brush");
		product.setDescription("This brust cleans teeth and gums");
		product.setPrice(10.00);
		product.setQuantity(1000);
		product.setRating(8);
		
		Product product2 = new Product();
		
		product2.setName("Colgate tooth paste");
		product2.setDescription("This paste cleans teeth and gums");
		product2.setPrice(10.00);
		product2.setQuantity(1000);
		product2.setRating(8);
		
		ProductDAO productService = new ProductDAO();
		
		productService.saveProduct(product);
		productService.saveProduct(product2);
		
		
		//Order
		
		OrderItem item = new OrderItem();
		item.setProduct(product);
		item.setQuantity(10);
		OrderItem item2 = new OrderItem();
		item2.setProduct(product2);
		item2.setQuantity(2);
		
		Order order = new Order();
		order.setAddress(address);
		order.setCustomer(customer);
		order.setDeleveryDate(new Date());
		order.setDeleveryPartner("EKART");
		order.setStatus("Orderd succeefullly");
		order.setPaymentMode("COD");
		order.setTotalAmount(100000.00);
		order.getOrderItems().add(item);
		order.getOrderItems().add(item2);
		
		OrderDAO orderService = new OrderDAO();
		
		orderService.saveOrder(order);
		
		

	}

}
