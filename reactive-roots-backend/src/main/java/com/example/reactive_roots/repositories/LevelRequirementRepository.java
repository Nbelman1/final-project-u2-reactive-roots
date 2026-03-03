package com.example.reactive_roots.repositories;

import com.example.reactive_roots.models.LevelRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRequirementRepository extends JpaRepository<LevelRequirement, Integer> {
}
