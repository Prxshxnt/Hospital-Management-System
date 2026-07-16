package com.Hospital.hospitalManagementSystem.entity;

import com.Hospital.hospitalManagementSystem.entity.type.BloodGroupType;
import com.Hospital.hospitalManagementSystem.entity.type.GenderType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate DOB;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    private String email;

    @Enumerated(EnumType.STRING)
    private GenderType Gender;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "patient_insurance", unique = true) //foreign key
    private Insurance insurance; // owner side

    @OneToMany(mappedBy = "patient")// inverse side
    private Set<Appointment> appointment = new HashSet<>();
}
