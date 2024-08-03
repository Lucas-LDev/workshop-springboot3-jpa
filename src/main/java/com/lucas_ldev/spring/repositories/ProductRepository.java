package com.lucas_ldev.spring.repositories;

import com.lucas_ldev.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
