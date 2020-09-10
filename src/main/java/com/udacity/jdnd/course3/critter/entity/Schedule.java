package com.udacity.jdnd.course3.critter.entity;

import com.udacity.jdnd.course3.critter.user.EmployeeSkill;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Schedule {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private LocalDate date;

    @OneToMany
    @JoinColumn(name = "petIds")
    private List<Long> petIds;

    @OneToMany
    @JoinColumn(name = "employeeIds")
    private List<Long> employeeIds;

    @OneToMany
    @JoinColumn(name = "activities")
    private Set<EmployeeSkill> activities;
}
