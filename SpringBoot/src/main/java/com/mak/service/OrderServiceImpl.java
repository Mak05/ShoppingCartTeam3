package com.mak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mak.dao.CartDao;
import com.mak.model.OrderDetails;


@Service
public class OrderServiceImpl implements OrderService{
	
	
	@Autowired
	private CartDao orderDao;
	
	
	@Override
	public List<OrderDetails> showOrder() {
		// TODO Auto-generated method stub
		return (List<OrderDetails>) orderDao.findAll();
	}


	@Override
	public OrderDetails getById(int id) {
		// TODO Auto-generated method stub
		return orderDao.findOne(id);
	}


	@Override
	public void saveProduct(OrderDetails editedProduct) {
		// TODO Auto-generated method stub
		orderDao.save(editedProduct);
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		orderDao.delete(id);
		
	}
}
