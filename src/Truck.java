public class Truck extends Vehicle {

    private double capacity;

    public Truck(String brand, int year, double capacity) {
        super(brand, year);
        this.capacity = capacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine is stopping");
    }
}

