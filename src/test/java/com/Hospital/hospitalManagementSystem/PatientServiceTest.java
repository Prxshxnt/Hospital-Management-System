package com.Hospital.hospitalManagementSystem;

import com.Hospital.hospitalManagementSystem.dto.BloodGroupStats;
import com.Hospital.hospitalManagementSystem.dto.CPatientInfo;
import com.Hospital.hospitalManagementSystem.entity.Appointment;
import com.Hospital.hospitalManagementSystem.repository.PatientRepo;
import com.Hospital.hospitalManagementSystem.service.AppointmentService;
import com.Hospital.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private AppointmentService appointmentService;

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

    @Test
    public void testCreateAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2023,01,02,01,01))
                .reason("Cancer")
                .build();

        var updateAppointment = appointmentService.createANewAppointment(appointment,1l,1l);
        System.out.println(updateAppointment);

        patientService.deletePatient(1L);
    }
}
