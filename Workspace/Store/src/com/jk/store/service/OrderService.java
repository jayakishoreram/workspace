package com.jk.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jk.store.dao.OrderDAO;
import com.jk.store.entity.Order;

@Service
@Transactional
public class OrderService {

	@Autowired
	private OrderDAO orderDAO;

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}
	
	
	public void saveOrder(Order order){
		orderDAO.saveOrder(order);
	}
	
	public Order findByID(long id){
		Order order = orderDAO.findByID(id);
		return order;
	}
}
