package org.example.LowLevelDesign.CarRentalOld;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Booking {
    private String id;
    private User user;
    private Car car;
    private LocalDateTime bookingTime;
    private LocalDateTime bookingTill;
}
