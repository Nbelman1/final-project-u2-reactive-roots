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
@RequestMapping("/api/inventory")
public class InventoryItemController {

    InventoryItemRepository repository;

    public InventoryItemController(InventoryItemRepository repository) {
        this.repository = repository;
    }

    // get all items
    @GetMapping("/items")
    public ResponseEntity<List<InventoryItem>> getAllItems() {
        return ResponseEntity.ok(repository.findAll()); // 200
    }

    // get an item
    @GetMapping("items/{id}")
    public ResponseEntity<InventoryItem> getItemById(@PathVariable int id) throws NoResourceFoundException {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new NoResourceFoundException(HttpMethod.GET, "/game/" + id, null));
    }

    // add new item
    @PostMapping
    public ResponseEntity<InventoryItem> addItem(@RequestBody InventoryItem item) {
        InventoryItem savedItem = repository.save(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED); // 201
    }

    // edit existing item
    @PutMapping("/{id}")
    public ResponseEntity<InventoryItem> updateItemQuantity(@PathVariable int id, @RequestBody InventoryItem details) {
        return repository.findById(id)
                .map(item -> {
                    item.setQuantity(details.getQuantity());
                    return ResponseEntity.ok(repository.save(item));
                })
                .orElse(ResponseEntity.notFound().build()); // 404
    }

    // delete existing item
//    TODO: not sending user.id to table
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 if successful
        }
        return ResponseEntity.notFound().build(); // 404 if missing
    }
}
