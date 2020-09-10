package com.udacity.jdnd.course3.critter.entity;

import com.udacity.jdnd.course3.critter.user.EmployeeSkill;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    @OneToMany
    @JoinColumn(name = "skills")
    private Set<EmployeeSkill> skills;

    @OneToMany
    @JoinColumn(name = "skills")
    private Set<DayOfWeek> daysAvailable;
}

