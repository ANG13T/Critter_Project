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

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){this.name = name;}

    public void setSkills(Set<EmployeeSkill> skills){this.skills = skills;}

    public void setDaysAvailable(Set<DayOfWeek> daysAvailable){this.daysAvailable = daysAvailable;}

    public String getName(){return name;}

    public Long getId() {
        return id;
    }

    public Set<DayOfWeek> getDaysAvailable() {
        return daysAvailable;
    }

    public Set<EmployeeSkill> getSkills() {
        return skills;
    }
}

