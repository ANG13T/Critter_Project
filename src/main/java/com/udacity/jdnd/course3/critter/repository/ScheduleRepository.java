package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.entity.Schedule;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ScheduleRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Schedule schedule) {
        entityManager.persist(schedule);
    }

    public Schedule find(Long id) {
        return entityManager.find(Schedule.class, id);
    }

    public Schedule merge(Schedule schedule){
        return entityManager.merge(schedule);
    }

    public void delete(Long id) {
        Schedule schedule = entityManager.find(Schedule.class, id);
        entityManager.remove(schedule);
    }

}
