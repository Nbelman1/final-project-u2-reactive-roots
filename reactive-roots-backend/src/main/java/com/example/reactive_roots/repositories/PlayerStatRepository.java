package com.example.reactive_roots.repositories;

import com.example.reactive_roots.models.PlayerStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Integer> {
    PlayerStat findByUser(int id);
    Optional<PlayerStat> findByUserId(int id);
}
