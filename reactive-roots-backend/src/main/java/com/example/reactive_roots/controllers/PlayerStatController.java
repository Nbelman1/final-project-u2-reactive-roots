package com.example.reactive_roots.controllers;

import com.example.reactive_roots.repositories.PlayerStatRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PlayerStatController {

    @Autowired
    PlayerStatRepository playerStatRepository;
}
