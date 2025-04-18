package entity;

public class Motorbike extends Vehicle{
    private double enginePower;

    public Motorbike(double enginePower) {
        this.enginePower = enginePower;
    }

    public Motorbike(String licensePlate, String manufacturerName, int yearOfManufacture, String owner, double enginePower) {
        super(licensePlate, manufacturerName, yearOfManufacture, owner);
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Motobike{" + super.toString() +
                "enginePower=" + enginePower +
                '}';
    }
}
