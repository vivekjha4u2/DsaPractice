package org.example.LowLevelDesign.CarRentalOld;

import java.time.LocalDateTime;

public interface Vehicle {

    public Booking book(User user, LocalDateTime till);
}
