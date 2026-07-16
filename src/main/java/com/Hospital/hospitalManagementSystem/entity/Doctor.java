package com.Hospital.hospitalManagementSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length = 50)
    private String name;

    @Column(nullable = false , length = 100)
    private String specialization;

    @Column(nullable = false , unique = true , length = 50)
    private String email;

    @OneToMany(mappedBy = "doctor")// inverse side
    private Set<Appointment> appointment = new HashSet<>();


}
