package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.entity.Customer;
import com.udacity.jdnd.course3.critter.entity.Hamster;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PetRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Hamster hamster) {
        entityManager.persist(hamster);
    }

    public Hamster find(Long id) {
        return entityManager.find(Hamster.class, id);
    }

    public Hamster merge(Hamster hamster){
        return entityManager.merge(hamster);
    }

    public void delete(Long id) {
        Hamster hamster = entityManager.find(Hamster.class, id);
        entityManager.remove(hamster);
    }
}
