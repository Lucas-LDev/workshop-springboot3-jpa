package com.lucas_ldev.spring.repositories;

import com.lucas_ldev.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
