package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.entity.Schedule;
import com.udacity.jdnd.course3.critter.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    public Long save(Schedule schedule){
        scheduleRepository.persist(schedule);
        return schedule.getId();
    }

    public Long update(Schedule schedule){
        scheduleRepository.merge(schedule);
        return schedule.getId();
    }

    public void delete(Long id){
        scheduleRepository.delete(id);
    }

    public Schedule get(Long id){
        return scheduleRepository.find(id);
    }

}
