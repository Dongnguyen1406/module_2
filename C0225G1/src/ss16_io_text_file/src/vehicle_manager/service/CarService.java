package vehicle_manager.service;

import vehicle_manager.entity.Car;
import vehicle_manager.repository.CarRepository;
import vehicle_manager.repository.ICarRepository;

import java.util.List;

public class CarService implements ICarService{
    private ICarRepository carRepository = new CarRepository();

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public boolean deleteByLicensePlateCar(String licensePlate) {
        return carRepository.deleteByLicensePlateCar(licensePlate);
    }
}
