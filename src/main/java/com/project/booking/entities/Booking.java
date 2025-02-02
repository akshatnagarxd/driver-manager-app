package com.project.booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Driver driver;
    private String pickupLocation;
    private String dropoffLocation;
    private String bookingTime;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Long id, Driver driver, String pickupLocation, String dropoffLocation, String bookingTime) {
		super();
		this.id = id;
		this.driver = driver;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.bookingTime = bookingTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropoffLocation() {
		return dropoffLocation;
	}
	public void setDropoffLocation(String dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", driver=" + driver + ", pickupLocation=" + pickupLocation + ", dropoffLocation="
				+ dropoffLocation + ", bookingTime=" + bookingTime + "]";
	}

    
}
