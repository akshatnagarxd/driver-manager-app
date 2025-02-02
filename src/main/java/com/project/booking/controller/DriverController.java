package com.project.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.project.booking.entities.Driver;
import com.project.booking.service.DriverService;

import java.util.List;

@Controller
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping
    public String listDrivers(Model model) {
    	
    	System.out.println("Driver controller is called");
    	System.out.println("returning to drivers.jsp page");
        List<Driver> drivers = driverService.getAllDrivers();
        model.addAttribute("drivers", drivers);
        return "drivers";
    }

    @PostMapping
    public String saveDriver(Driver driver) {
        driverService.saveDriver(driver);
        return "redirect:/drivers";
    }

    // Other API endpoints...
}
