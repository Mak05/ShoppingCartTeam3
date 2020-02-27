package com.mak.service;

import java.util.List;

import com.mak.model.OrderDetails;


public interface OrderService {
	//public void saveCustomer(Order order);
	public List<OrderDetails> showOrder();

	public OrderDetails getById(int id);

	public void saveProduct(OrderDetails editedProduct);

	public void delete(int id);
}
