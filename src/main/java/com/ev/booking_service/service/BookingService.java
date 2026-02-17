package com.ev.booking_service.service;

import com.ev.booking_service.entity.Booking;
import com.ev.booking_service.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository repository;

    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }

    public Booking saveBooking(Booking booking) {
        return repository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return repository.findAll();
    }
}
