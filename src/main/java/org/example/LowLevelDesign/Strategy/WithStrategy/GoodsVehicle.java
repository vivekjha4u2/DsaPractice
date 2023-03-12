package org.example.LowLevelDesign.Strategy.WithStrategy;

import org.example.LowLevelDesign.Strategy.WithStrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
