package org.example.LowLevelDesign.CarRentalOld;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        //Vehicle, Car, User, booking,
        Car car = new Car();
        car.setNumber(100);
        car.setModel("Swift");

        User ram = new User();
        ram.setName("Ram");
        car.book(ram, LocalDateTime.of(2023,4,12,8,0));
    }
}
