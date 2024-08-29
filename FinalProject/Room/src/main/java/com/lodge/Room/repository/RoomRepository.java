package com.lodge.Room.repository;

import com.lodge.Room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findBylocation(String location);
}
