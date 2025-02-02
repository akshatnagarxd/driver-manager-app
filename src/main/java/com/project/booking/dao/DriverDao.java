package com.project.booking.dao;

import java.util.List;

import com.project.booking.entities.Driver;

public interface DriverDao {
	public void save(Driver driver);
	public void update(Driver driver);
	public void delete(Driver driver);
	public Driver findById(Long id);
	public List<Driver> findAll();
}
