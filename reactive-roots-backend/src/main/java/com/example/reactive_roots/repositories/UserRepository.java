package com.example.reactive_roots.repositories;

import com.example.reactive_roots.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
