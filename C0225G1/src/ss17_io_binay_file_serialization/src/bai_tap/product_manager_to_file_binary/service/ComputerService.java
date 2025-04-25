package bai_tap.product_manager_to_file_binary.service;

import bai_tap.product_manager_to_file_binary.entity.Computer;
import bai_tap.product_manager_to_file_binary.repository.ComputerRepository;
import bai_tap.product_manager_to_file_binary.repository.IComputerRepository;

import java.util.List;

public class ComputerService implements IComputerService{
    private IComputerRepository computerRepository = new ComputerRepository();
        
    @Override
    public List<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public void add(Computer computer) {
        computerRepository.addComputer(computer);
    }
}
