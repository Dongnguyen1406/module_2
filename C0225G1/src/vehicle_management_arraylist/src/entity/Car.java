package entity;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String vehicleType;

    public Car(){}

    public Car(String vehicleType, int numberOfSeats) {
        this.vehicleType = vehicleType;
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String licensePlate, String manufacturerName, int yearOfManufacture, String owner, String vehicleType, int numberOfSeats) {
        super(licensePlate, manufacturerName, yearOfManufacture, owner);
        this.vehicleType = vehicleType;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "vehicleType=" +  vehicleType +
                ", numberOfSeats='" + numberOfSeats + '\'' +
                '}';
    }
}
