package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.OrdersEntity;
import com.cts.model.Orders;


@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {

	Optional<Orders> findById(int orderId);
	
}
