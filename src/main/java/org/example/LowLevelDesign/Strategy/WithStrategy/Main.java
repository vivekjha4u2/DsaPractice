package org.example.LowLevelDesign.Strategy.WithStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle mercedes = new LuxuryVehicle();
        mercedes.drive();

        Vehicle tata407 = new GoodsVehicle();
        tata407.drive();
    }
}
