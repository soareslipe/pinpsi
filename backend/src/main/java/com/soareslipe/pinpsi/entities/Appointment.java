package com.soareslipe.pinpsi.entities;

import java.math.BigDecimal;
import java.sql.Date;

import com.soareslipe.pinpsi.entities.enums.AppointmentType;
import com.soareslipe.pinpsi.entities.enums.Status;

public class Appointment {
	
	Long id;
	Date start_time;
	Date end_time;
	AppointmentType type; 
	String link; 
	String localion;
	Status status;
	String notes;
	BigDecimal price;
	
}
