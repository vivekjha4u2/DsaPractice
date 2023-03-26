package org.example.LowLevelDesign.AbstractFactory.factory;

import org.example.LowLevelDesign.AbstractFactory.vehicles.Vehicle;

public interface VehicleFactory {
    // it will give the obj of vehicle
    Vehicle getVehicle(String model);

}
