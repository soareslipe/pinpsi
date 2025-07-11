package com.soareslipe.pinpsi.entities;

import java.math.BigDecimal;
import java.sql.Date;

import com.soareslipe.pinpsi.entities.enums.AppointmentType;
import com.soareslipe.pinpsi.entities.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_appointment")
public class Appointment {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date start_time;
	private Date end_time;
	private AppointmentType type; 
	private String link; 
	private String localion;
	private Status status;
	private String notes;
	private BigDecimal price;
	
	
	
}
