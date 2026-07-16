package com.Hospital.hospitalManagementSystem;

import com.Hospital.hospitalManagementSystem.dto.BloodGroupStats;
import com.Hospital.hospitalManagementSystem.dto.CPatientInfo;
import com.Hospital.hospitalManagementSystem.repository.PatientRepo;
import com.Hospital.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private PatientService patientService;

    @Test
    public void getCPatient(){

//        List<BloodGroupStats> bloodGroupStatsList = patientRepo.getAllPatientBloodGroupStats();
//
//        for(var p : bloodGroupStatsList){
//            System.out.println(p);

        patientService.testPatientTransaction();

    }
}
