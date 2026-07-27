package com.Hospital.hospitalManagementSystem;

import com.Hospital.hospitalManagementSystem.entity.Insurance;
import com.Hospital.hospitalManagementSystem.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {
    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testAssignInsuranceToPatient(){

        Insurance insurance = Insurance.builder()
                .Provider("HDFC Ergo")
                .PolicyNumber("HDFC 001")
                .ValidDate(LocalDate.of(2030,01,01))
                .build();

        var updateInsurance = insuranceService.assignInsuranceToPatient(insurance , 1L);

        System.out.println(updateInsurance);

        var patient = insuranceService.deleteInsuranceToPatient(1L);
        System.out.println(patient);

    }

}
