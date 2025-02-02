package com.project.booking.dao;

import java.util.List;

import com.project.booking.entities.Booking;

public interface BookingDao {
	public void save(Booking booking);
	public void update(Booking booking);
	public void delete(Booking booking);
	public Booking findById(Long id);
	public List<Booking> findAll();
}
