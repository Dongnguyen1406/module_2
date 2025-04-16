package service;


import entity.Motobike;

public interface IMotobikeService {
    Motobike[] findAll();
    void addMotobike(Motobike motobike);
    void deleteByControlPlateMotobike(String licensePlate);

}
