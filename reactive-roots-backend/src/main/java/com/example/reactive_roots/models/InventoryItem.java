package com.example.reactive_roots.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "inventory_items")
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    private String itemName;

    private Integer quantity;

    private Integer slotPosition;

    public InventoryItem() {
    }

    public InventoryItem(Integer itemId, User user, String itemName, Integer quantity, Integer slotPosition) {
        this.itemId = itemId;
        this.user = user;
        this.itemName = itemName;
        this.quantity = quantity;
        this.slotPosition = slotPosition;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSlotPosition() {
        return slotPosition;
    }

    public void setSlotPosition(Integer slotPosition) {
        this.slotPosition = slotPosition;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "itemId=" + itemId +
                ", user=" + user +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", slotPosition=" + slotPosition +
                '}';
    }
}
