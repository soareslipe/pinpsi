package com.soareslipe.pinpsi.entities.dto;

import java.sql.Date;

import com.soareslipe.pinpsi.entities.Patient;

public record PatientDTO(
		 Long id,
		 String fullName,
		 String email,
		 Date birthdate,
		 String gender,
		 String phone1,
		 String phone2
		) {
	
    public PatientDTO(Patient patient) {
        this(
            patient.getId(),
            patient.getFullName(),
            patient.getEmail(),
            patient.getBirthdate(),
            patient.getGender(),
            patient.getPhone1(),
            patient.getPhone2()
        );
    }
}
