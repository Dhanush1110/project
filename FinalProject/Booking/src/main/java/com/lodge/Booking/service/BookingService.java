package com.lodge.Booking.service;

import com.lodge.Booking.entity.Booking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lodge.Booking.repository.BookingRepository;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
@Service
    public class BookingService {
	private static final Logger logger = LoggerFactory.getLogger(BookingService.class);

        private BookingRepository bookingRepository;

        public Booking createBooking(Booking booking)
        {
        	 logger.info("Creating a new booking for customer ID: {} and room ID: {}", booking.getCustomerId(), booking.getRoomId());
            return bookingRepository.save(booking);
        }
        public Booking getBookingById(Long id)
        {
        	logger.info("Fetching booking details for booking ID: {}", id);
            return bookingRepository.findById(id).orElse(null);
        }
}
