package entity;

public class Villa extends Facility{
    private String standardRoom;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String serviceCode, String serviceName, double area, double cost, int maxPeople, String rentType, String standardRoom, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, area, cost, maxPeople, rentType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    

    @Override
    public String getInfo() {
        return "Villa{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
