package com.lodge.Room.service;

import com.lodge.Room.entity.Room;
import com.lodge.Room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class RoomService {
	 private static final Logger logger = LoggerFactory.getLogger(RoomService.class);
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getRoomsByLocation(String location)
    {
    	 logger.info("Fetching rooms for location: {}", location);
        return roomRepository.findBylocation(location);
    }
    public Room getRoomById(Long id)
    {
    	  logger.info("Fetching room details for room ID: {}", id);
        return roomRepository.findById(id).orElse(null);
    }
}
