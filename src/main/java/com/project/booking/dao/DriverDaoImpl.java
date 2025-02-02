package com.project.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.project.booking.entities.Driver;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DriverDaoImpl implements DriverDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void save(Driver driver) {
        hibernateTemplate.save(driver);
    }

    @Transactional
    public void update(Driver driver) {
        hibernateTemplate.update(driver);
    }

    @Transactional
    public void delete(Driver driver) {
        hibernateTemplate.delete(driver);
    }

    public Driver findById(Long id) {
        return hibernateTemplate.get(Driver.class, id);
    }

    public List<Driver> findAll() {
        return hibernateTemplate.loadAll(Driver.class);
    }
}
