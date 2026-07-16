package com.Hospital.hospitalManagementSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true,length = 50)
    private String PolicyNumber;

    @Column(nullable = false , length = 100)
    private String Provider;

    @Column(nullable = false)
    private LocalDate ValidDate;

    @Column(nullable = false , unique = false)
    private LocalDateTime CreatedAt;

    @OneToOne(mappedBy = "insurance")
    private Patient patient;
}
