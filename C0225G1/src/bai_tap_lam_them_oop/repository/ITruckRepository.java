package repository;

import entity.Truck;

public interface ITruckRepository {
    Truck[] findAll();
    void addTruck(Truck truck);
    void deleteByControlPlateTruck(String controlPlate);
}
