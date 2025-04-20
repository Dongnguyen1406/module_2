package service;

import entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void deleteByLicensePlateTruck(String licensePlate);
}
