package org.example.LowLevelDesign.AbstractFactory;

import org.example.LowLevelDesign.AbstractFactory.factory.AbsVehicleFactory;
import org.example.LowLevelDesign.AbstractFactory.factory.VehicleFactory;
import org.example.LowLevelDesign.AbstractFactory.vehicles.LuxuryVehicle;
import org.example.LowLevelDesign.AbstractFactory.vehicles.OrdinaryVehicle;
import org.example.LowLevelDesign.AbstractFactory.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        AbsVehicleFactory absVehicleFactory = new AbsVehicleFactory();
        VehicleFactory vf = absVehicleFactory.getVehicleFactory("Luxury");
        Vehicle vehicle = vf.getVehicle("Mercedes");
        vehicle.drive();

        //
        LuxuryVehicle vehicle1 = (LuxuryVehicle) vf.getVehicle("Bmw");
        vehicle1.capability();
        vehicle1.drive();

        //
        OrdinaryVehicle ov = (OrdinaryVehicle) vf.getVehicle("Swift");
        ov.capability();
        ov.drive();
    }
}
