package vehicle_manager.repository;

import vehicle_manager.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public interface IMotorbikeRepository {
    List<Motorbike> findAll();
    void add(Motorbike motorbike);
    boolean deleteByLicensePlateMotor(String licensePlate);
}
