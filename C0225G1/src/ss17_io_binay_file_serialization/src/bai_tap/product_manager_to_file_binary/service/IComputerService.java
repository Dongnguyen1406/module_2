package bai_tap.product_manager_to_file_binary.service;

import bai_tap.product_manager_to_file_binary.entity.Computer;

import java.util.List;

public interface IComputerService {
   List<Computer> findAll();
   void add(Computer computer);
}
