package entity;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceCode, String serviceName, double area, double cost, int maxPeople, String rentType, String freeService) {
        super(serviceCode, serviceName, area, cost, maxPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    

    @Override
    public String getInfo() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
