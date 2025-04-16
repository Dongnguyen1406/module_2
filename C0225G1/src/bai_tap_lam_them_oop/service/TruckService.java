package service;

import entity.Truck;
import repository.ITruckRepository;
import repository.TruckRepository;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();
    
    @Override
    public Truck[] findAll(){
       return truckRepository.findAll();
    }
    
    @Override
    public void addTruck(Truck truck) {
        truckRepository.addTruck(truck);
    }

    @Override
    public void deleteByControlPlateTruck(String licensePlate) {
        truckRepository.deleteByControlPlateTruck(licensePlate);
    }

}


