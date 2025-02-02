package com.project.booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String licenseNumber;
    
    
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Driver(Long id, String name, String licenseNumber) {
		super();
		this.id = id;
		this.name = name;
		this.licenseNumber = licenseNumber;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", licenseNumber=" + licenseNumber + "]";
	}

    
}
