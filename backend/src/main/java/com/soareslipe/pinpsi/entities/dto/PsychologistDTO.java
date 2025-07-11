package com.soareslipe.pinpsi.entities.dto;

import java.sql.Date;

import com.soareslipe.pinpsi.entities.Psychologist;

public record PsychologistDTO(
		Long id, String fullName, String email, Date birthdate, String cRP, String phone,
		String spacialization, String state, String city) {
	
    public PsychologistDTO(Psychologist entity) {
        this(
            entity.getId(),
            entity.getFullName(),
            entity.getEmail(),
            entity.getBirthdate(),
            entity.getCRP(),
            entity.getPhone(),
            entity.getSpacialization(),
            entity.getState(),
            entity.getCity()
        );
    }

}
