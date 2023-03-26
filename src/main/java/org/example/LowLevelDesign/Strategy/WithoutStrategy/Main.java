package org.example.LowLevelDesign.Strategy.WithoutStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffroadVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive();
    }
}
