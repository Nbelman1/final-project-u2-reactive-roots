package com.example.reactive_roots.dto;

import java.util.Date;

public class UserProfileDTO {
    private String username;
    private String password;
    private int expWoodcutting;
    private int levelWoodcutting;
    private Date dateCreated;

    public UserProfileDTO() {
    }

    public UserProfileDTO(String username, String password, int expWoodcutting, int levelWoodcutting, Date dateCreated) {
        this.username = username;
        this.password = password;
        this.expWoodcutting = expWoodcutting;
        this.levelWoodcutting = levelWoodcutting;
        this.dateCreated = dateCreated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getExpWoodcutting() {
        return expWoodcutting;
    }

    public void setExpWoodcutting(int expWoodcutting) {
        this.expWoodcutting = expWoodcutting;
    }

    public int getLevelWoodcutting() {
        return levelWoodcutting;
    }

    public void setLevelWoodcutting(int levelWoodcutting) {
        this.levelWoodcutting = levelWoodcutting;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
