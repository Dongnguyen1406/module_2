package repository;

import entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();
    void addCar(Car car);
    void deleteByControlPlateCar(String controlPlate);

}
