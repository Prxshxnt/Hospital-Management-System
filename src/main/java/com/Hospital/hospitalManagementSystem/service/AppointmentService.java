package com.Hospital.hospitalManagementSystem.service;

import com.Hospital.hospitalManagementSystem.entity.Appointment;
import com.Hospital.hospitalManagementSystem.entity.Doctor;
import com.Hospital.hospitalManagementSystem.entity.Patient;
import com.Hospital.hospitalManagementSystem.repository.AppointmentRepository;
import com.Hospital.hospitalManagementSystem.repository.DoctorRepository;
import com.Hospital.hospitalManagementSystem.repository.PatientRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final PatientRepo patientRepo;
    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId){

        Patient patient = patientRepo.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);

        return appointment;
    }

}
