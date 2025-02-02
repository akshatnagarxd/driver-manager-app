package com.project.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.booking.dao.DriverDao;
import com.project.booking.entities.Driver;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverDao driverDao;

    public void saveDriver(Driver driver) {
        driverDao.save(driver);
    }

    public List<Driver> getAllDrivers() {
        return driverDao.findAll();
    }
    
    public Driver findById(Long id) {
        return driverDao.findById(id);
    }

    // Other service methods...
}
