package designPattern.factoryMethod;

public class Customer {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle("car");
        car.showVehicleType();
        Vehicle motorCycle = vehicleFactory.createVehicle("motorCycle");
        motorCycle.showVehicleType();
    }
}
