package com.Hospital.hospitalManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne // owner side
    @JoinColumn(nullable = false)
    @ToString.Exclude
    @JsonIgnore
    private Patient patient;

    @ManyToOne()
    @JoinColumn(nullable = false)
    @ToString.Exclude
    @JsonIgnore
    private Doctor doctor;
}
