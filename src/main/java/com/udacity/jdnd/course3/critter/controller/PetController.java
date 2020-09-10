package com.udacity.jdnd.course3.critter.controller;

import com.udacity.jdnd.course3.critter.entity.Hamster;
import com.udacity.jdnd.course3.critter.service.PetService;
import com.udacity.jdnd.course3.critter.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/{id}")
    public Hamster getPet(@PathVariable Long id) {
        return petService.get(id);
    }

    @PostMapping
    public void createPet(Hamster pet) {
        petService.save(pet);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.delete(id);
    }

    @PatchMapping
    public void updatePet(Hamster pet){
        petService.update(pet);
    }
}
