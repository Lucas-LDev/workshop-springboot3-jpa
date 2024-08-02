package com.lucas_ldev.spring.repositories;

import com.lucas_ldev.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
