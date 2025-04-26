package vehicle_manager.repository;

import vehicle_manager.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();
    void add(Truck truck);
    boolean deleteByLicensePlateTruck(String licensePlate);
}
