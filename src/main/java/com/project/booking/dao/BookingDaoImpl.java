package com.project.booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.project.booking.entities.Booking;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BookingDaoImpl implements BookingDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void save(Booking booking) {
        hibernateTemplate.save(booking);
    }

    @Transactional
    public void update(Booking booking) {
        hibernateTemplate.update(booking);
    }

    @Transactional
    public void delete(Booking booking) {
        hibernateTemplate.delete(booking);
    }

    public Booking findById(Long id) {
        return hibernateTemplate.get(Booking.class, id);
    }

    public List<Booking> findAll() {
        return hibernateTemplate.loadAll(Booking.class);
    }
}
