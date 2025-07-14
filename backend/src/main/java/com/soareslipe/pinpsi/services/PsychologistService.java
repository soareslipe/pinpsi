package com.soareslipe.pinpsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soareslipe.pinpsi.entities.Psychologist;
import com.soareslipe.pinpsi.entities.dto.PsychologistDTO;
import com.soareslipe.pinpsi.repositories.PsychologistRepository;

@Service
public class PsychologistService {

	@Autowired
	private PsychologistRepository psychologistRepository;
	
	@Transactional(readOnly = true)
	public PsychologistDTO getPsychologistById(Long id) {
		Psychologist entity = psychologistRepository.getReferenceById(id);
		return new PsychologistDTO(entity);
	}
	
	@Transactional
	public PsychologistDTO insertPsychologist(PsychologistDTO dto) {
		Psychologist entity = new Psychologist();
		copyDtoToEntity(dto, entity);
		entity = psychologistRepository.save(entity);
		return new PsychologistDTO(entity);
	}
	
	@Transactional
	public PsychologistDTO updatePsychologist(Long id, PsychologistDTO dto) {
		Psychologist entity = new Psychologist();
		copyDtoToEntity(dto, entity);
		entity = psychologistRepository.save(entity);
		return new PsychologistDTO(entity);
	}
	
	public void deletePsychologist(Long id) {
		psychologistRepository.deleteById(id);
	}
	
	
	private void copyDtoToEntity(PsychologistDTO dto, Psychologist entity) {
		entity.setFullName(dto.fullName());
		entity.setBirthdate(dto.birthdate());
		entity.setCity(dto.city());
		entity.setCRP(dto.crp());
		entity.setEmail(dto.email());
		entity.setPhone(dto.phone());
		entity.setSpacialization(dto.spacialization());
		entity.setState(dto.state());
	}
}
