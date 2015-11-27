package com.jk.store.service.test;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jk.store.entity.Address;
import com.jk.store.entity.Customer;
import com.jk.store.entity.Order;
import com.jk.store.entity.OrderItem;
import com.jk.store.entity.Product;
import com.jk.store.service.AddressService;
import com.jk.store.service.CustomerService;
import com.jk.store.service.OrderService;
import com.jk.store.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
//@ContextConfiguration(classes = { ApplicationContext.class }, loader = AnnotationConfigContextLoader.class)
public class ServiceTest {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ProductService produtService;
	
	@Test
	public void testCRUDOperations(){
		Customer customer = new Customer();

		customer.setFirstName("Jack");
		customer.setLastName("Sparrow");
		customer.setEmail("jacksparrow@email.com");
		customer.setPhone("9986712345");
		customer.setLoginId("jacksparrow@email.com");
		customer.setPassword("Jack12345");
		customerService.saveCustomer(customer);
		
		
		Address address = new Address();
		
		address.setLine1("#986/23, 24 th cross, F lane");
		address.setLine2("Behind Munnswara layout, ejipura.");
		address.setCity("Bengalore");
		address.setState("Karnataka");
		address.setPincode(560047);
		address.setCustomer(customer);
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
		
		produtService.saveProduct(product);
		produtService.saveProduct(product2);
		
		
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
		
		orderService.saveOrder(order);
	}
}
