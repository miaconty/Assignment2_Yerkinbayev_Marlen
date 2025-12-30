public class Main {

    public static void main(String[] args) {


        Driver driver1 = new Driver("Ali", "KZ12345");
        Driver driver2 = new Driver("Dana", "KZ67890");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2019, false);
        Vehicle truck = new Truck("Volvo", 2018, 12.5, 4);

        Vehicle[] vehicles = { car, motorcycle, truck };

        Driver[] drivers = { driver1, driver2, driver1 };

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
            vehicles[i].displayInfo();
            drivers[i].displayDriverInfo();
            vehicles[i].stopEngine();
            System.out.println("--------------------");
        }
    }
}


