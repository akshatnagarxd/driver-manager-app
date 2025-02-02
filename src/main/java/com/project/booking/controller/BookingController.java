package com.project.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.booking.config.DriverEditor;
import com.project.booking.entities.Booking;
import com.project.booking.entities.Driver;
import com.project.booking.service.BookingService;
import com.project.booking.service.DriverService;

import java.util.List;

@Controller
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private DriverService driverService;
    
    @Autowired
    private DriverEditor driverEditor;
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Driver.class, driverEditor);
    }
    
    @GetMapping
    public String listBookings(Model model) {
    	List<Driver> drivers = driverService.getAllDrivers();
        List<Booking> bookings = bookingService.getAllBookings();
        model.addAttribute("bookings", bookings);
        model.addAttribute("drivers", drivers);
        return "bookings";
    }

    @PostMapping
    public String saveBooking(@ModelAttribute Booking booking) {
    	bookingService.saveBooking(booking);
        return "redirect:/bookings";
    }
}
