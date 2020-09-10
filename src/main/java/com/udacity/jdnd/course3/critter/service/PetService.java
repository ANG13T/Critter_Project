package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.entity.Hamster;
import com.udacity.jdnd.course3.critter.entity.Schedule;
import com.udacity.jdnd.course3.critter.repository.PetRepository;
import com.udacity.jdnd.course3.critter.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;

    public Long save(Hamster hamster){
        petRepository.persist(hamster);
        return hamster.getId();
    }

    public Long update(Hamster hamster){
        petRepository.merge(hamster);
        return hamster.getId();
    }

    public void delete(Long id){
        petRepository.delete(id);
    }

    public Hamster get(Long id){
        return petRepository.find(id);
    }
}
