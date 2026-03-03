package com.example.reactive_roots.controllers;

import com.example.reactive_roots.models.PlayerStat;
import com.example.reactive_roots.repositories.PlayerStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stats")
public class PlayerStatController {

    PlayerStatRepository repository;

    public PlayerStatController (PlayerStatRepository repository) {
        this.repository = repository;
    }

    // GET stats for all players
    @GetMapping("/players")
    public ResponseEntity<List<PlayerStat>> getAllPlayerStats() {
        return ResponseEntity.ok(repository.findAll());
    }

    // GET stats for player by user id
    @GetMapping("/players/{id}")
    public ResponseEntity<PlayerStat>  getPlayerStatsById(@PathVariable int id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); // 404
    }

//    TODO: Finish player stat controller nad user controller, then test in Postman
}
