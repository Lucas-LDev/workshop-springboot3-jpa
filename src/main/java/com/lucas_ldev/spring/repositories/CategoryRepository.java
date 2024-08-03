package com.lucas_ldev.spring.repositories;

import com.lucas_ldev.spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
