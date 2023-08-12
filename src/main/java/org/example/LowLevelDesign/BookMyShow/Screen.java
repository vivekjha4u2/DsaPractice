package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Screen {
    private String screenId;
    private List<Show> showList = new ArrayList<>();
}
