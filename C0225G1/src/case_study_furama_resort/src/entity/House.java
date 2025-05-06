package entity;

public class House extends Facility{
    private String standardRoom;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, double area, double cost, int maxPeople, String rentType, String standardRoom, int numberOfFloors) {
        super(serviceCode, serviceName, area, cost, maxPeople, rentType);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    

    @Override
    public String getInfo() {
        return "House{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
