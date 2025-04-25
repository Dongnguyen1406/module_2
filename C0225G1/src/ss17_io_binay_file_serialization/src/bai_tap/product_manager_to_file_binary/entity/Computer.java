package bai_tap.product_manager_to_file_binary.entity;

import java.io.Serializable;

public class Computer extends Product implements Serializable {
    private String computerType;
    private String resolution;

    public Computer(String computerType, String resolution) {
        this.computerType = computerType;
        this.resolution = resolution;
    }

    public Computer(int id, String name, Double price, String manufacturer, String description, String computerType, String resolution) {
        super(id, name, price, manufacturer, description);
        this.computerType = computerType;
        this.resolution = resolution;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        resolution = resolution;
    }

    @Override
    public String toString() {
        return "Computer{" + super.toString() +
                "computerType='" + computerType + '\'' +
                ", Resolution='" + resolution + '\'' +
                '}';
    }

    public String getInfoComputerToBinaryFile() {
        return super.getId() + "," + super.getName() + "," + super.getPrice() + "," + super.getManufacturer() + "," + super.getDescription() + "," + this.getComputerType() + "," + this.getResolution();
    }
}
