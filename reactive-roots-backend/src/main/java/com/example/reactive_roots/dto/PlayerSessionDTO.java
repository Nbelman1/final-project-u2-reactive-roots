package com.example.reactive_roots.dto;

import java.util.List;

public class PlayerSessionDTO {
    private int userId;
    private int expWoodcutting;

    private List<InventoryItemDTO> inventory;

    public PlayerSessionDTO() {
    }

    public PlayerSessionDTO(int userId, int expWoodcutting, List<InventoryItemDTO> inventory) {
        this.userId = userId;
        this.expWoodcutting = expWoodcutting;
        this.inventory = inventory;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExpWoodcutting() {
        return expWoodcutting;
    }

    public void setExpWoodcutting(int expWoodcutting) {
        this.expWoodcutting = expWoodcutting;
    }

    public List<InventoryItemDTO> getInventory() {
        return inventory;
    }

    public void setInventory(List<InventoryItemDTO> inventory) {
        this.inventory = inventory;
    }
}
