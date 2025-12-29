public class Car extends Vehicle {

    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopping");
    }
}
