package com.lodge.Booking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lodge.Booking.entity.Booking;
import com.lodge.Booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BookingController {
	private static final Logger logger = LoggerFactory.getLogger(BookingController.class);
    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking)
    {
    	  logger.info("Request to create a booking for customer ID: {} and room ID: {}", booking.getCustomerId(), booking.getRoomId());
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id)
    {
    	logger.info("Request to get booking by ID: {}", id);
        return ResponseEntity.ok(bookingService.getBookingById(id));
    }
}
