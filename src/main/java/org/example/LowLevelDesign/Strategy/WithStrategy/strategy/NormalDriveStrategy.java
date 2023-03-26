package org.example.LowLevelDesign.Strategy.WithStrategy.strategy;

import org.example.LowLevelDesign.Strategy.WithStrategy.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
