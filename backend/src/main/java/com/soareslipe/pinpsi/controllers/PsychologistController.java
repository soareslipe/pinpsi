package com.soareslipe.pinpsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soareslipe.pinpsi.entities.dto.PsychologistDTO;
import com.soareslipe.pinpsi.services.PsychologistService;

@RestController
@RequestMapping(value = "psychologist")
public class PsychologistController {
	
	@Autowired
	private PsychologistService psychologistService;
	
	@GetMapping("/{id}")
	ResponseEntity<PsychologistDTO> getPsychologistById(@PathVariable("id") Long id){
		PsychologistDTO dto = psychologistService.getPsychologistById(id);
		return ResponseEntity.ok().body(dto);
	}
}
