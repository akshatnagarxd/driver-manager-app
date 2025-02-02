package com.project.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.booking.dao.BookingDao;
import com.project.booking.dao.DriverDao;
import com.project.booking.entities.Booking;
import com.project.booking.entities.Driver;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDao bookingDao;
    @Autowired
    private DriverDao driverDao;

    public void saveBooking(Booking booking) {
    	bookingDao.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingDao.findAll();
    }

    // Other service methods...
}
