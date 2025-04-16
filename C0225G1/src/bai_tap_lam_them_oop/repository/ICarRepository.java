package repository;

import entity.Car;

public interface ICarRepository {
    Car[] findAll();
    void addCar(Car car);
    void deleteByControlPlateCar(String controlPlate);

}
