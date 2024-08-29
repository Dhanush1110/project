package com.lodge.Room.controller;

import com.lodge.Room.entity.Room;
import com.lodge.Room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/rooms")
public class RoomController {
	private static final Logger logger = LoggerFactory.getLogger(RoomController.class);
    @Autowired
    private RoomService roomService;

    @GetMapping("/location")
    public ResponseEntity<List<Room>> getRoomByLocation(@RequestParam String location)
    {
    	  logger.info("Request to get rooms by location: {}", location);
        return ResponseEntity.ok(roomService.getRoomsByLocation(location));
    }

    @GetMapping("/{id}")

    public ResponseEntity<Room> getRoomById(@RequestParam Long id)
    {
    	 logger.info("Request to get room by ID: {}", id);
        return ResponseEntity.ok(roomService.getRoomById(id));
    }
}
