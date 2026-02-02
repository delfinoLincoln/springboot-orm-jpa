package com.delfinolincoln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delfinolincoln.course.entities.OrderItem;
import com.delfinolincoln.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    
}
