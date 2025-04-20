package service;

import entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    void add(Car car);
    void deleteByLicensePlateCar(String licensePlate);
}
