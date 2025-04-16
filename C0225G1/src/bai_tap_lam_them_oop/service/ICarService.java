package service;

import entity.Car;


public interface ICarService {
    Car[] findAll();
    void addCar(Car car);
    void deleteByControlPlateCar(String licensePlate);
}
