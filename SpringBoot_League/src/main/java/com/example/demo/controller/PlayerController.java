package com.example.demo.controller;

import org.eclipse.jdt.internal.compiler.env.IModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.demo.entities.PlayerData;
import com.example.demo.repo.PlayerDataRepo;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayerController {
    @Autowired
    PlayerDataRepo playerDataRepo;
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/showData")
    public ModelAndView showData()
    {
        ModelAndView mv = new ModelAndView();
        List<PlayerData> dataList = playerDataRepo.findAll();
        mv.addObject("data", dataList);
        mv.setViewName("view");
        return mv;
    }

    @PostMapping("/saveData")
    public ModelAndView saveData(PlayerData playerData)
    {
        playerDataRepo.save(playerData);
        ModelAndView mv = new ModelAndView();
        List<PlayerData> dataList = playerDataRepo.findAll();
        mv.addObject("data", dataList);
        mv.setViewName("view");
        return mv;

    }
    @RequestMapping("/deleteData")
    public ModelAndView deleteData(@RequestParam("id") int id)
    {
        playerDataRepo.deleteById(id);
        ModelAndView mv = new ModelAndView();
        List<PlayerData> dataList = playerDataRepo.findAll();
        mv.addObject("data", dataList);
        mv.setViewName("view");
        return mv;
    }

    @RequestMapping("/updateData")
    @ResponseBody
    public ModelAndView updateData(PlayerData playerData) {
        PlayerData updateData = playerDataRepo.findByName(playerData.getName());
        updateData.setRole(playerData.getRole());
        playerDataRepo.save(updateData);
        ModelAndView mv = new ModelAndView();
        List<PlayerData> dataList = playerDataRepo.findAll();
        mv.addObject("data", dataList);
        mv.setViewName("view");
        return mv;
    }

}
