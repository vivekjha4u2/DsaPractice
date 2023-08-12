package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Theatre {
    private String theatreId;
    private String address;
    private String city;
    private List<Screen> screenList = new ArrayList<>();
}
