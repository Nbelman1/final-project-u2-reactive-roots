package com.example.reactive_roots.repositories;

import com.example.reactive_roots.models.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer> {
}
