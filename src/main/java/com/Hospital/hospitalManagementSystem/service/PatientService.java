package com.Hospital.hospitalManagementSystem.service;

import com.Hospital.hospitalManagementSystem.entity.Patient;
import com.Hospital.hospitalManagementSystem.repository.PatientRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepo patientRepo;
@Transactional
    public void testPatientTransaction(){
        Patient p1 = patientRepo.findById(1L).orElseThrow();
        Patient p2 = patientRepo.findById(1L).orElseThrow();
        System.out.println(p1 + " " + p2);
        System.out.println(p1==p2);

        p1.setName("Rahul kumar");
    }

    @Transactional
    public  void deletePatient(Long patientId){
    patientRepo.findById(patientId).orElseThrow();
    patientRepo.deleteById(patientId);
    }

}
