package bai_tap.product_manager_to_file_binary.repository;

import bai_tap.product_manager_to_file_binary.entity.Computer;
import bai_tap.product_manager_to_file_binary.util.ReadAndWriteToBinaryFile;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepository implements IComputerRepository{
    private final String COMPUTER_FILE = "src/bai_tap/product_manager_to_file_binary/data/computer.txt";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false; 
        
    @Override
    public List<Computer> findAll() {
        List<Computer> computers = new ArrayList<>();
        List<String> stringList = ReadAndWriteToBinaryFile.readFile(COMPUTER_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Computer computer = new Computer(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), array[3], array[4], array[5], array[6]);
            computers.add(computer);
        }
        return computers;
    }

    @Override
    public void addComputer(Computer computer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(computer.getInfoComputerToBinaryFile());
        ReadAndWriteToBinaryFile.writeFile(COMPUTER_FILE, stringList, APPEND);
    }
}
