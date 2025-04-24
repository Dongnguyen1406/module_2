package service;

import entity.Car;
import repository.CarRepository;
import repository.ICarRepository;

import java.util.ArrayList;

public class CarService implements ICarService{
    private ICarRepository carRepository = new CarRepository();

    @Override
    public ArrayList<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public void deleteByLicensePlateCar(String licensePlate) {
        carRepository.deleteByLicensePlateCar(licensePlate);
    }
}
