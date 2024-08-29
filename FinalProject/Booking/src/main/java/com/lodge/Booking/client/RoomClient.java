package com.lodge.Booking.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lodge.Room.entity.Room;

@FeignClient(name="room-service")
public interface RoomClient {
    @GetMapping("/rooms/{id}")
    Room getRoomById(@PathVariable("id") Long id);
}
