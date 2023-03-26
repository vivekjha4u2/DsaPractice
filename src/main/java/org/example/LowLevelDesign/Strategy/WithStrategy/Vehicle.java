package org.example.LowLevelDesign.Strategy.WithStrategy;

import org.example.LowLevelDesign.Strategy.WithStrategy.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //Constructor Injection
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    void drive(){
        driveStrategy.drive();
    }
}
