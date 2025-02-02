package com.project.booking.config;

import java.beans.PropertyEditorSupport;
import com.project.booking.entities.Driver;
import com.project.booking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverEditor extends PropertyEditorSupport {

    @Autowired
    private DriverService driverService;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Long id = Long.parseLong(text);
        Driver driver = driverService.findById(id); // Implement this method in DriverService
        setValue(driver);
    }
}