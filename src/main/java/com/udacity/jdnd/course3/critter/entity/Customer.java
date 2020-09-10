package com.udacity.jdnd.course3.critter.entity;


import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    @Nationalized
    private String phoneNumber;

    @Nationalized
    private String notes;

    @OneToMany
    @JoinColumn(name = "pet_ids")
    private List<Long> petIds;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPetIds(List<Long> petIds) {
        this.petIds = petIds;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public List<Long> getPetIds() {
        return petIds;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
