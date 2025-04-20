package service;

import entity.Motorbike;
import repository.IMotorbikeRepository;
import repository.MotorbikeRepository;

import java.util.ArrayList;

public class MotorbikeService implements IMotorbikeService{
    private IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    @Override
    public ArrayList<Motorbike> findAll() {
        return motorbikeRepository.findAll();
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikeRepository.add(motorbike);
    }

    @Override
    public void deleteByLicensePlateMotor(String licensePlate) {
        motorbikeRepository.deleteByLicensePlateMotor(licensePlate);
    }
}
