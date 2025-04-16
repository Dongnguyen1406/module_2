package service;

import entity.Truck;

public interface ITruckService {
    Truck[] findAll();
    void addTruck(Truck truck);
    void deleteByControlPlateTruck(String licensePlate);
}
