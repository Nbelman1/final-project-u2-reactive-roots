package com.example.reactive_roots.controllers;


import com.example.reactive_roots.models.InventoryItem;
import com.example.reactive_roots.repositories.InventoryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/game")
public class InventoryItemController {

    InventoryItemRepository inventoryItemRepository;

    public InventoryItemController(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    // get all items
    @GetMapping("/items")
    public ResponseEntity<List<InventoryItem>> getAllItems() {
        return ResponseEntity.ok(inventoryItemRepository.findAll()); // 200
    }

    // get an item
    @GetMapping("/{itemId}")
    public ResponseEntity<InventoryItem> getItemById(@PathVariable int itemId) throws NoResourceFoundException {
        return inventoryItemRepository.findById(itemId)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new NoResourceFoundException(HttpMethod.GET, "/game/" + itemId, null));
    }

    // add new item
    @PostMapping
    public ResponseEntity<InventoryItem> addItem(@RequestBody InventoryItem item) {
        InventoryItem savedItem = inventoryItemRepository.save(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED); // 201
    }

    // delete existing item
    @DeleteMapping("/{itemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable int itemId) {
        if (inventoryItemRepository.existsById(itemId)) {
            inventoryItemRepository.deleteById(itemId);
            return ResponseEntity.noContent().build(); // 204
        }
        return ResponseEntity.notFound().build(); // 404 if missing
    }
}
