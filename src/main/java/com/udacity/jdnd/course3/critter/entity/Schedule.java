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


    public void setId(Long id){
        this.id = id;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public void setPetIds(List<Long> petIds){
        this.petIds = petIds;
    }

    public void setEmployeeIds(List<Long> employeeIds){
        this.employeeIds = employeeIds;
    }

    public void setActivities(Set<EmployeeSkill> activities){
        this.activities = activities;
    }

    public Long getId(){
        return this.id;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public List<Long> getPetIds(){
        return this.petIds;
    }

    public List<Long> getEmployeeIds(){
        return this.employeeIds;
    }

    public Set<EmployeeSkill> getActivities(){
        return this.activities;
    }

}
