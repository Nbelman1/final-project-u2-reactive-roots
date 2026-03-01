package com.example.reactive_roots.models;

import jakarta.persistence.*;

@Entity
@Table(name = "player_stats")
public class PlayerStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int expWoodcutting;

    private int levelWoodcutting;

    public PlayerStat() {
    }

    public PlayerStat(int statId, User user, int expWoodcutting, int levelWoodcutting) {
        this.statId = statId;
        this.user = user;
        this.expWoodcutting = expWoodcutting;
        this.levelWoodcutting = levelWoodcutting;
    }

    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = this.user;
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

    @Override
    public String toString() {
        return "PlayerStat{" +
                "statId=" + statId +
                ", userId=" + user +
                ", expWoodcutting=" + expWoodcutting +
                ", levelWoodcutting=" + levelWoodcutting +
                '}';
    }
}
