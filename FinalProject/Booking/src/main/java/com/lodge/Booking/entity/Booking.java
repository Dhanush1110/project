package com.lodge.Booking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private  Long customerId;

    @NotNull
    private  Long roomId;

    @NotNull
    private Date dateOfEntry;

    @NotNull
    private BigDecimal advanceAmount;


    public @NotNull Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(@NotNull Long customerId) {
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull Long getRoomId() {
        return roomId;
    }

    public void setRoomId(@NotNull Long roomId) {
        this.roomId = roomId;
    }

    public @NotNull Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(@NotNull Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public @NotNull BigDecimal getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(@NotNull BigDecimal advanceAmount) {
        this.advanceAmount = advanceAmount;
    }
}
