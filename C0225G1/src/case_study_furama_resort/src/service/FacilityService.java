package service;

import entity.Facility;
import entity.House;
import entity.Room;
import entity.Villa;
import repository.FacilityRepository;
import repository.IFacilityRepository;
import utils.ValidateUtils;
import view.FacilityView;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private final FacilityView facilityView = new FacilityView();
    private final IFacilityRepository repo = new FacilityRepository();

    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> list = repo.getMaintenanceList();
        if (list.isEmpty()) {
            System.out.println("No facilities need maintenance.");
        } else {
            for (Map.Entry<Facility, Integer> entry : list.entrySet()) {
                System.out.println(entry.getKey() + " | Usage: " + entry.getValue());
            }
        }
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> entry : repo.getAll().entrySet()) {
            System.out.println(entry.getKey() + " | Usage: " + entry.getValue());
        }
    }

    @Override
    public void addNew() {
        String choice = facilityView.getFacilityChoice();

        switch (choice) {
            case "1":
                repo.add(createVilla());
                System.out.println("Villa added.");
                break;
            case "2":
                repo.add(createHouse());
                System.out.println("House added.");
                break;
            case "3":
                repo.add(createRoom());
                System.out.println("Room added.");
                break;
            case "4":
                return;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private Villa createVilla() {
        String id = facilityView.getVillaId();
        String name = facilityView.getServiceName();
        double area = facilityView.getArea();
        double cost = facilityView.getCost();
        int max = facilityView.getMaxPeople();
        String type = facilityView.getRentalType();
        String standard = facilityView.getRoomStandard();
        double pool = facilityView.getPoolArea();
        int floor = facilityView.getFloors();

        return new Villa(id, name, area, cost, max, type, standard, pool, floor);
    }

    private House createHouse() {
        String id = facilityView.getHouseId();
        String name = facilityView.getServiceName();
        double area = facilityView.getArea();
        double cost = facilityView.getCost();
        int max = facilityView.getMaxPeople();
        String type = facilityView.getRentalType();
        String standard = facilityView.getRoomStandard();
        int floor = facilityView.getFloors();

        return new House(id, name, area, cost, max, type, standard, floor);
    }

    private Room createRoom() {
        String id = facilityView.getRoomId();
        String name = facilityView.getServiceName();
        double area = facilityView.getArea();
        double cost = facilityView.getCost();
        int max = facilityView.getMaxPeople();
        String type = facilityView.getRentalType();
        String free = facilityView.getFreeService();

        return new Room(id, name, area, cost, max, type, free);
    }
}

