package com.delfinolincoln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delfinolincoln.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
