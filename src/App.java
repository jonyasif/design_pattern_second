public class App {

    public static void main(String[] args) {

        VehicleCompany vehicleCompany = new VehicleCompany();

        Car car = new Car();

        vehicleCompany.setVehicleBuilder(car);

        Vehicle vehicle1 = vehicleCompany.construct();

        System.out.println("Wheels"+" "+vehicle1.getWheels()+" Passengers"+vehicle1.getPassengers()+" Gas"+vehicle1.getGas());

        Plane plane = new Plane();

        vehicleCompany.setVehicleBuilder(plane);

        Vehicle vehicle2 = vehicleCompany.construct();

        System.out.println("Wheels"+" "+vehicle2.getWheels()+" Passengers"+vehicle2.getPassengers()+" Gas"+vehicle2.getGas());

    }

}
