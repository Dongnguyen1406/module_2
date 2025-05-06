package repository;

import entity.Facility;
import entity.House;
import entity.Room;
import entity.Villa;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    private static final String FILE_PATH = "src/data/facility.csv";
    private static final LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        facilityMap.put(new Villa("SVVL-0001", "Luxury Villa", 100, 500, 4, "Day", "5-star", 40, 2), 5);
        facilityMap.put(new House("SVHO-0001", "Family House", 80, 300, 6, "Month", "4-star", 1), 0);
        facilityMap.put(new Room("SVRO-0001", "Standard Room", 50, 100, 2, "Day", "Free Breakfast"), 0);
    }


    @Override
    public Map<Facility, Integer> getAll() {
        return facilityMap;
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public Map<Facility, Integer> getMaintenanceList() {
        Map<Facility, Integer> maintenance = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenance.put(entry.getKey(), entry.getValue());
            }
        }
        return maintenance;
    }
}
