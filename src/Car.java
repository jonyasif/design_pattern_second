public class Car extends VehicleBuilder {
    @Override
    public void buildWheels() {
        vehicle.setWheels(4);
    }

    @Override
    public void buildPassengers() {
        vehicle.setPassengers(30);
    }

    @Override
    public void buildGas() {
        vehicle.setGas(true);
    }
}
