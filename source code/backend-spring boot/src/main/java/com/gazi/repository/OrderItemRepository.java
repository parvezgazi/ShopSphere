package com.gazi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazi.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
