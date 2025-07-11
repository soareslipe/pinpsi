package com.soareslipe.pinpsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soareslipe.pinpsi.entities.Psychologist;

@Repository
public interface PsychologistRepository extends JpaRepository<Psychologist, Long> {

}
