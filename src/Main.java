public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("Yerkinbayev Marlen", "909MAR09");

        Vehicle car = new Car("Toyota", 2021, 4);
        Vehicle bike = new Motorcycle("Honda", 2019, false);
        Vehicle truck = new Truck("MAN", 2018, 10.5);

        car.setDriver(driver);
        bike.setDriver(driver);
        truck.setDriver(driver);

        Vehicle[] vehicles = { car, bike, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v.driver != null) {
                v.driver.displayDriverInfo();
            }

            v.stopEngine();
            System.out.println("-------------------");
        }
    }
}

