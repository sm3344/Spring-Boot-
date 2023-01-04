package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.PlayerData;

public interface PlayerDataRepo extends JpaRepository <PlayerData, Integer> {
    PlayerData findByName(String name);
    PlayerData findByRole(String role);

}
