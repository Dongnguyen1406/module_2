package vehicle_manager.entity;

public class Truck extends Vehicle{
    private double loadCapacity; // trọng tải

    public Truck(String licensePlate, String manufacturerName, int yearOfManufacture, String owner, double loadCapacity) {
        super(licensePlate, manufacturerName, yearOfManufacture, owner);
        this.loadCapacity = loadCapacity;
    }

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
