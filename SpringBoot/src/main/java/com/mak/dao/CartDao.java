package com.mak.dao;

import org.springframework.data.repository.CrudRepository;

import com.mak.model.OrderDetails;

public interface CartDao extends CrudRepository<OrderDetails, Integer>{

}
