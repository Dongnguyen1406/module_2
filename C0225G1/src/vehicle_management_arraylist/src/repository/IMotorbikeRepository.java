package repository;

import entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();
    void add(Motorbike motorbike);
    void deleteByLicensePlateMotor(String licensePlate);
}
