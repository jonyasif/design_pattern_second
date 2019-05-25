public class Plane extends VehicleBuilder {
    @Override
    public void buildWheels() {
        vehicle.setWheels(18);
    }

    @Override
    public void buildPassengers() {
        vehicle.setPassengers(1000);
    }

    @Override
    public void buildGas() {
        vehicle.setGas(false);
    }
}
