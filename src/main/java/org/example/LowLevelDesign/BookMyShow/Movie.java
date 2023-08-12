package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private String movieId;
    private String name;
    private int duration;
}
