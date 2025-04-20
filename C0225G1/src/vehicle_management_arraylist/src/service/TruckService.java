package service;

import entity.Truck;
import repository.ITruckRepository;
import repository.TruckRepository;

import java.util.ArrayList;

public class TruckService implements ITruckService{
    private ITruckRepository truckRepository = new TruckRepository();
    @Override
    public ArrayList<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public void deleteByLicensePlateTruck(String licensePlate) {
        truckRepository.deleteByLicensePlateTruck(licensePlate);
    }
}
