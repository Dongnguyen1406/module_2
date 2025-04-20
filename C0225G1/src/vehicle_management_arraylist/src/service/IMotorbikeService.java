package service;

import entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeService {
    ArrayList<Motorbike> findAll();
    void add(Motorbike motorbike);
    void deleteByLicensePlateMotor(String licensePlate);
}
