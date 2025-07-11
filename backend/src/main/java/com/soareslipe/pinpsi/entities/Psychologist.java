package com.soareslipe.pinpsi.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_psychologist")
public class Psychologist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String fullName;
	String email;
	Date birthdate;
	String CRP;
	String phone;
	String spacialization;
	String state;
	String city;
	
	public Psychologist() {}
	
	public Psychologist(Long id, String fullName, String email, Date birthdate, String cRP, String phone,
			String spacialization, String state, String city) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.birthdate = birthdate;
		CRP = cRP;
		this.phone = phone;
		this.spacialization = spacialization;
		this.state = state;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCRP() {
		return CRP;
	}

	public void setCRP(String cRP) {
		CRP = cRP;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpacialization() {
		return spacialization;
	}

	public void setSpacialization(String spacialization) {
		this.spacialization = spacialization;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
