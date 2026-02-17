package com.ev.booking_service.controller;

import com.ev.booking_service.entity.Booking;
import com.ev.booking_service.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return service.saveBooking(booking);
    }

    @GetMapping
    public List<Booking> getBookings() {
        return service.getAllBookings();
    }
}
