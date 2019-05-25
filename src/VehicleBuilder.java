public abstract class VehicleBuilder {

    Vehicle vehicle = new Vehicle();

    public abstract void buildWheels();
    public abstract void buildPassengers();
    public abstract void buildGas();

    public Vehicle getVehicle(){
        return vehicle;
    }
}
