package com.example.reactive_roots.models;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory_items")
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String itemName;

    private int quantity;

    private int slotPosition;

    public InventoryItem() {
    }

    public InventoryItem(int itemId, User user, String itemName, int quantity, int slotPosition) {
        this.itemId = itemId;
        this.user = user;
        this.itemName = itemName;
        this.quantity = quantity;
        this.slotPosition = slotPosition;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public User getUser() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSlotPosition() {
        return slotPosition;
    }

    public void setSlotPosition(int slotPosition) {
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
