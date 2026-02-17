package com.ev.booking_service.service;

import com.ev.booking_service.entity.Booking;
import com.ev.booking_service.repository.BookingRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository repository;
    private final RestTemplate restTemplate;

    public BookingService(BookingRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public Booking saveBooking(Booking booking) {

        // Call Station Service
        String stationUrl = "http://localhost:8082/stations/" + booking.getStationId();

        try {
            Object station = restTemplate.getForObject(stationUrl, Object.class);

            if (station == null) {
                throw new RuntimeException("Station not found");
            }

        } catch (Exception e) {
            throw new RuntimeException("Station validation failed");
        }

        return repository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return repository.findAll();
    }
}
