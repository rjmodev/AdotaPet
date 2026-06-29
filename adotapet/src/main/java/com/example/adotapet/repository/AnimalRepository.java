package com.example.adotapet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.adotapet.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
