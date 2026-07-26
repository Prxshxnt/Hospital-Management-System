package com.Hospital.hospitalManagementSystem;

import com.Hospital.hospitalManagementSystem.dto.IPatientInfo;
import com.Hospital.hospitalManagementSystem.repository.PatientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class HospitalManagementSystemApplicationTests {

	@Autowired
	private PatientRepo patientRepo;


//	@Test
//	public void testPatient(){
//		List<Patient> patientList = patientRepo.findAll();
//
//		for (Patient p : patientList){
//			System.out.println(p);
//		}
//	}

	@Test
	public void getPatient() {
		List<IPatientInfo> iPatientInfos = patientRepo.getAllPatientsInfo();{

			for (IPatientInfo p : iPatientInfos) {
				System.out.println(p);
			}
		}
	}
}

