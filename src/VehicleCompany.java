public class VehicleCompany {

    private VehicleBuilder vehicleBuilder;

    public void setVehicleBuilder(VehicleBuilder vehicleBuilder){
        this.vehicleBuilder = vehicleBuilder;
    }

    public Vehicle construct(){
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildPassengers();
        vehicleBuilder.buildGas();
        return vehicleBuilder.getVehicle();
    }
}
