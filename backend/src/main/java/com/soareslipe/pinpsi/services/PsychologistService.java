package com.soareslipe.pinpsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soareslipe.pinpsi.entities.Psychologist;
import com.soareslipe.pinpsi.entities.dto.PsychologistDTO;
import com.soareslipe.pinpsi.repositories.PsychologistRepository;

import jakarta.transaction.Transactional;

@Service
public class PsychologistService {

	@Autowired
	private PsychologistRepository psychologistRepository;
	
	@Transactional
	public PsychologistDTO getPsychologistById(Long id) {
		Psychologist entity = psychologistRepository.getReferenceById(id);
		return new PsychologistDTO(entity);
	}
}
