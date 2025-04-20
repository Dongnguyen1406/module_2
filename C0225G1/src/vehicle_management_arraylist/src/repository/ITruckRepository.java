package repository;

import entity.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void deleteByLicensePlateTruck(String licensePlate);
}
