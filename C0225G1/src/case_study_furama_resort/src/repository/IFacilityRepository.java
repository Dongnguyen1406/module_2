package repository;

import entity.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> getAll();
    void add(Facility facility);
    Map<Facility, Integer> getMaintenanceList();
}
