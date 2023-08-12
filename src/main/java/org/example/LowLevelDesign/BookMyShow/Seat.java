package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seat {
    private String seatId;
    private int row;
    private int price;
    private SeatCategory seatCategory;
}
