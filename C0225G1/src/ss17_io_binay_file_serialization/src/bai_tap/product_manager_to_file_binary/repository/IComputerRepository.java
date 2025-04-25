package bai_tap.product_manager_to_file_binary.repository;

import bai_tap.product_manager_to_file_binary.entity.Computer;

import java.util.ArrayList;
import java.util.List;

public interface IComputerRepository {
   List<Computer> findAll();
   void addComputer(Computer computer);
}
