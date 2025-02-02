package com.project.booking.service;

import java.util.List;

import com.project.booking.entities.Driver;

public interface DriverService {
	public void saveDriver(Driver driver);
	public List<Driver> getAllDrivers();
	public Driver findById(Long id);
}
