package service;

import entity.Car;
import repository.CarRepository;
import repository.ICarRepository;

public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public Car[] findAll() {
        return carRepository.findAll();
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public void deleteByControlPlateCar(String licensePlate) {
        carRepository.deleteByControlPlateCar(licensePlate);
    }


}
