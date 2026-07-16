package com.Hospital.hospitalManagementSystem.repository;

import com.Hospital.hospitalManagementSystem.dto.BloodGroupStats;
import com.Hospital.hospitalManagementSystem.dto.CPatientInfo;
import com.Hospital.hospitalManagementSystem.dto.IPatientInfo;
import com.Hospital.hospitalManagementSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mapping.model.IdPropertyIdentifierAccessor;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    List<Patient> findByEmailContaining(String d);

    @Query("select p.id as id , p.name as name , p.email as email from Patient p")
    List<IPatientInfo> getAllPatientsInfo();

    @Query(" select new com.Hospital.hospitalManagementSystem.dto.CPatientInfo(p.id,p.email) " + "from Patient p ")
    List<CPatientInfo> getAllPatientInfoConcrete();

    @Query("SELECT new com.Hospital.hospitalManagementSystem.dto.BloodGroupStats(p.bloodGroup, COUNT(p)) " +
            "FROM Patient p GROUP BY p.bloodGroup ORDER BY COUNT(p) DESC")
    List<BloodGroupStats> getAllPatientBloodGroupStats();
}
