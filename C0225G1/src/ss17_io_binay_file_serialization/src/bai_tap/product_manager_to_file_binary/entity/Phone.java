package bai_tap.product_manager_to_file_binary.entity;

import java.io.Serializable;

public class Phone extends Product implements Serializable {
    private String phoneOS;

    public Phone(String phoneOS) {
        this.phoneOS = phoneOS;
    }

    public Phone(int id, String name, Double price, String manufacturer, String description, String phoneOS) {
        super(id, name, price, manufacturer, description);
        this.phoneOS = phoneOS;
    }

    public String getPhoneOS() {
        return phoneOS;
    }

    public void setPhoneOS(String phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public String toString() {
        return "Phone{" + super.toString() +
                "phoneOS='" + phoneOS + '\'' +
                '}';
    }
    public String getInfoComputerToBinaryFile(){
        return super.getId() + "," + super.getName() + "," + super.getPrice() + "," + super.getManufacturer() + "," + super.getDescription() + ","  + this.getPhoneOS();
    }
}
