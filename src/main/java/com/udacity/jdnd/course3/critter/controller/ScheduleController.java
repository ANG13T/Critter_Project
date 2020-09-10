package com.udacity.jdnd.course3.critter.controller;


import com.udacity.jdnd.course3.critter.entity.Schedule;
import com.udacity.jdnd.course3.critter.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/{id}")
    public Schedule getSchedule(@PathVariable Long id) {
        return scheduleService.get(id);
    }

    @PostMapping
    public void createSchedule(Schedule schedlue) {
        scheduleService.save(schedlue);
    }

    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        scheduleService.delete(id);
    }

    @PatchMapping
    public void updateSchedule(Schedule schedlue){
        scheduleService.update(schedlue);
    }

}
