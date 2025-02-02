package com.project.booking.service;

import java.util.List;

import com.project.booking.entities.Booking;

public interface BookingService {
	public void saveBooking(Booking booking);
	public List<Booking> getAllBookings();
}
