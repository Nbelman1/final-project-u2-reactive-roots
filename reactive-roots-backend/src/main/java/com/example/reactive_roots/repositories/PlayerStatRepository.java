package com.example.reactive_roots.repositories;

import com.example.reactive_roots.models.PlayerStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Integer> {
}
