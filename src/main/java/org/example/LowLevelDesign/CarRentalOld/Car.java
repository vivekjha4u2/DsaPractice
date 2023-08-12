package org.example.LowLevelDesign.CarRentalOld;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class Car implements Vehicle {
    private int number;
    private String model;
    private boolean isBooked;

    @Override
    public Booking book(User user, LocalDateTime till) {
        Booking booking = new Booking();
        String id = UUID.randomUUID().toString();
        booking.setId(id);
        booking.setUser(user);
        booking.setBookingTime(LocalDateTime.now());
        booking.setBookingTill(till);
        System.out.println("Booking done for : ");
        System.out.println("id = " + id);
        System.out.println("booking = " + booking);
        System.out.println("user = " + user);
        System.out.println("till = " + till);
        return booking;
    }
}
