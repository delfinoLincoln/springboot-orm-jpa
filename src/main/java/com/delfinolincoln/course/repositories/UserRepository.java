package com.delfinolincoln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delfinolincoln.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
