package service;


import entity.Motobike;
import repository.IMotobikeRepository;
import repository.MotobikeRepository;

public class MotobikeService implements IMotobikeService{
    private IMotobikeRepository motobikeRepository = new MotobikeRepository();

    @Override
    public Motobike[] findAll(){
        return motobikeRepository.findAll();
    }

    @Override
    public void addMotobike(Motobike motobike) {
        motobikeRepository.addMotobike(motobike);
    }

    @Override
    public void deleteByControlPlateMotobike(String licensePlate) {
        motobikeRepository.deleteByControlPlateMotobike(licensePlate);
    }
}
