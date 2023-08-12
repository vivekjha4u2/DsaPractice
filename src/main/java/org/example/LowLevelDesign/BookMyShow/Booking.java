package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    private String bookingId;
    private Show show;
    private List<Seat> seatList = new ArrayList<>();
    private Payment payment;

}
