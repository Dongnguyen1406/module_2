package bai_tap.product_manager_to_file_binary.view;

import bai_tap.product_manager_to_file_binary.entity.Computer;
import bai_tap.product_manager_to_file_binary.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ComputerView {
    private static Scanner sc = new Scanner(System.in);
    public static void displayComputer(List<Computer> computers){
        if(computers.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        
        for (Computer computer : computers){
            System.out.println(computer);
        }
    }
    
    public static Computer inputDataForComputer(){
        System.out.println("Chức năng thêm máy tính");
        
        Product product = ProductView.inputProduct();
        
        System.out.println("Nhập loại máy tính (Bàn/Laptop): ");
        String computerType = sc.nextLine();
        
        System.out.println("Nhập độ phân giải: ");
        String resolution = sc.nextLine();
        
        Computer computer = new Computer(product.getId(), product.getName(), product.getPrice(), product.getManufacturer(), product.getDescription(), computerType, resolution);
        return computer;
    }
}
