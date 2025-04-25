package vehicle_manager.repository;

import vehicle_manager.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarRepository {
    List<Car> findAll();
    void addCar(Car car);
    boolean deleteByLicensePlateCar(String controlPlate);
    
}
