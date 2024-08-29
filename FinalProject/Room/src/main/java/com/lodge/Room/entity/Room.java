package com.lodge.Room.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String location;

    @NotBlank
    private String roomType;

    @NotBlank
    private BigDecimal price;

    public @NotBlank BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@NotBlank BigDecimal price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank String location) {
        this.location = location;
    }

    public @NotBlank String getRoomType() {
        return roomType;
    }

    public void setRoomType(@NotBlank String roomType) {
        this.roomType = roomType;
    }
}
