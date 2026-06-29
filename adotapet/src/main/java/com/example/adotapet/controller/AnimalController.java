package com.example.adotapet.controller;

import com.example.adotapet.model.Animal;
import com.example.adotapet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalRepository repository;

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping
    public List<Animal> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Animal cadastrar(@RequestBody Animal animal01){
        return repository.save(animal01);
    }
}
