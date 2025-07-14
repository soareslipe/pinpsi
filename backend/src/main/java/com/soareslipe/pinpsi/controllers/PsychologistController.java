package com.soareslipe.pinpsi.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.soareslipe.pinpsi.entities.dto.PsychologistDTO;
import com.soareslipe.pinpsi.services.PsychologistService;

@RestController
@RequestMapping(value = "psychologist")
public class PsychologistController {
	
	@Autowired
	private PsychologistService psychologistService;
	
	@GetMapping("/{id}")
	public ResponseEntity<PsychologistDTO> getPsychologistById(@PathVariable("id") Long id){
		PsychologistDTO dto = psychologistService.getPsychologistById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<PsychologistDTO> insertPsychologist(@RequestBody PsychologistDTO dto){
		PsychologistDTO body = psychologistService.insertPsychologist(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(body.id()).toUri();
		return ResponseEntity.created(uri).body(body);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PsychologistDTO> updatePsychologist(@PathVariable("id") Long id,@RequestBody PsychologistDTO dto){
		dto = psychologistService.updatePsychologist(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<PsychologistDTO> deletePsychologistById(@PathVariable("id") Long id){
		psychologistService.deletePsychologist(id);
		return ResponseEntity.noContent().build();
	}
	
}
