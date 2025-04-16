package repository;


import entity.Motobike;

public interface IMotobikeRepository {
    Motobike[] findAll();
    void addMotobike(Motobike motobike);
    void deleteByControlPlateMotobike(String controlPlate);

}
