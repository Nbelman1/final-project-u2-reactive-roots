package com.example.reactive_roots.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    private String username;

    private String password;

    private LocalDate dateCreated;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<InventoryItem> inventoryItems;

    public User() {
    }

    public User(Integer id, String username, String password, LocalDate dateCreated) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.dateCreated = dateCreated;
    }

    public Integer getUser_id() {
        return id;
    }

    public void setUser_id(Integer id) {
        this.id = id;
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

    public LocalDate getDate_created() {
        return dateCreated;
    }

    public void setDate_created(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
