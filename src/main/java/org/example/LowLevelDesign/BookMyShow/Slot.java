package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Slot {
    private int startTime;
    private int endTime;
}
