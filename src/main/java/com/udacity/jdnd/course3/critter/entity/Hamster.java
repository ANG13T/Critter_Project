package com.udacity.jdnd.course3.critter.entity;

import com.udacity.jdnd.course3.critter.pet.PetType;
import com.udacity.jdnd.course3.critter.user.EmployeeSkill;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Hamster {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private PetType type;

    @Nationalized
    private String name;

    @Nationalized
    private Long ownerId;

    @Nationalized
    private LocalDate birthDate;

    @Nationalized
    private String notes;

    public void setId(Long id){
        this.id = id;
    }

    public void setType(PetType type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOwnerId(Long ownerId){
        this.ownerId = ownerId;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

    public String getNotes(){
        return this.notes;
    }

    public String getName(){return this.name;}

    public LocalDate getBirthDate(){return this.birthDate;}

    public Long getOwnerId() {
        return ownerId;
    }

    public PetType getType() {
        return type;
    }

    public Long getId() {
        return id;
    }
}
