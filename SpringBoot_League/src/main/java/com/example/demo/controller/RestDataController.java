

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.PlayerData;
import com.example.demo.repo.PlayerDataRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestDataController {
    @Autowired
    PlayerDataRepo repo;

    @RequestMapping("/viewData")
    public List<PlayerData> viewData(){
        return repo.findAll();
    }
    @GetMapping("/viewDataByName/{name}")
    public PlayerData viewDataByName(@PathVariable("name") String name)
    {
        return repo.findByName(name);
    }

    @GetMapping("/viewDataByRole/{role}")
    public PlayerData viewDataById(@PathVariable("role") String role)
    {
        return repo.findByRole(role);
    }

    @GetMapping("/viewDataById/{id}")
    public Optional<PlayerData> viewDataById(@PathVariable("id") Integer id)
    {
        return repo.findById(id);
    }

    @DeleteMapping("/deletesData/{id}")
    public void deletesData(@PathVariable("id") Integer id)
    {
         repo.deleteById(id);
    }
    @PostMapping("/savesData")
    public void savesData(PlayerData playerData)
    {
        repo.save(playerData);

    }





}
