package edu.bu.met.cs665;

import edu.bu.met.cs665.drivertype.FreelanceDriver;
import edu.bu.met.cs665.drivertype.ScooterDriver;
import edu.bu.met.cs665.drivertype.TaxiDriver;
import edu.bu.met.cs665.drivertype.VanDriver;

public class DriverFactory {
    public static Driver createDriver(DriverType driverType, String name) {
        switch (driverType) {
            case VAN_DRIVER:
                return new VanDriver(name);
            case TAXI_DRIVER:
                return new TaxiDriver(name);
            case SCOOTER_DRIVER:
                return new ScooterDriver(name);
            case FREELANCE_DRIVER:
                return new FreelanceDriver(name);
            default:
                throw new IllegalArgumentException("Invalid driver type.");
        }
    }
}
