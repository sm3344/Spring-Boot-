package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name="PLAYER")
public class PlayerData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROLE")
    private String role;


    public Integer getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;}


}
