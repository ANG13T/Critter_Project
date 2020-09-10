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
    private long ownerId;

    @Nationalized
    private LocalDate birthDate;

    @Nationalized
    private String notes;
}
