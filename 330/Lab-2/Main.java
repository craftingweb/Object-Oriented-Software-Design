public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Volga", 1961);
        vehicle.start();
        Vehicle car = new Car("Lada", 1970); // here because of data type of Vehicle, car inherites all Vehicle's members.
        car.start();
        Vehicle motorcycle = new Motorcycle("Java", 1980);
        motorcycle.start();
        // Bicycle
        Vehicle bicycle = new Bicycle(); // declaration has to be iniated above, not below where it used.

        // Array of Vehicles
        Vehicle [] vehicles = {vehicle, car, motorcycle, bicycle}; // size of array is number of inside elements, because they are the same type we can put them in one array
        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].start();
        }

        // Object as a parameter
        printVehicleInfo(vehicle);
        printVehicleInfo(car);
        printVehicleInfo(motorcycle);




    }

       // print method declaration has to be done outside of main and have keyword static but method envokation inside of Main
        public static void printVehicleInfo(Vehicle typeOfVehicle){
            System.out.println("Brand is "+ typeOfVehicle.brand + " and make year is " + typeOfVehicle.year + ".");

        }


}