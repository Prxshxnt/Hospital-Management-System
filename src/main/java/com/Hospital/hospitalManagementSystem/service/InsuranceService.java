package com.Hospital.hospitalManagementSystem.service;

import com.Hospital.hospitalManagementSystem.entity.Insurance;
import com.Hospital.hospitalManagementSystem.entity.Patient;
import com.Hospital.hospitalManagementSystem.repository.InsuranceRepository;
import com.Hospital.hospitalManagementSystem.repository.PatientRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;
    private final PatientRepo patientRepo;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepo.findById(patientId).orElseThrow();

        patient.setInsurance(insurance);

        insurance.setPatient(patient);
        return insuranceRepository.save(insurance); // persist


    }

    @Transactional
    public Insurance updateInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepo.findById(patientId).orElseThrow();

        patient.setInsurance(insurance);

        insurance.setPatient(patient);
        return insuranceRepository.save(insurance);
    }

    @Transactional
    public Patient deleteInsuranceToPatient(Long patientId) {
        Patient patient = patientRepo.findById(patientId).orElseThrow();

        patient.setInsurance(null);

        return patient;
    }
    }
