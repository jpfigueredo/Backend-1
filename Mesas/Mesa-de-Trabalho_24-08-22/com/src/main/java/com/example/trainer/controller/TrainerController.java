package com.example.trainer.controller;

import com.example.trainer.model.Trainer;
import com.example.trainer.service.impl.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerServiceImpl trainerServiceImpl;

    @GetMapping
    public List<Trainer> getTrainer(){
        return trainerServiceImpl.listTrainer();
    }


}
