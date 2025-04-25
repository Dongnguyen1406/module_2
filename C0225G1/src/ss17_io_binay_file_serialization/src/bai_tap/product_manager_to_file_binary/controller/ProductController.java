package bai_tap.product_manager_to_file_binary.controller;

import bai_tap.product_manager_to_file_binary.entity.Computer;
import bai_tap.product_manager_to_file_binary.entity.Phone;
import bai_tap.product_manager_to_file_binary.service.ComputerService;
import bai_tap.product_manager_to_file_binary.service.PhoneService;
import bai_tap.product_manager_to_file_binary.view.ComputerView;
import bai_tap.product_manager_to_file_binary.view.PhoneView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ComputerService computerService = new ComputerService();
    private static final PhoneService phoneService = new PhoneService();

    public static void displayProduct(){
        boolean flag = true;
        do {
            System.out.println("HIỂN THỊ SẢN PHẨM" +
                    "\n 1. Hiển thị máy tính." +
                    "\n 2. Hiển thị điện thoại." +
                    "\n 3. Quay về menu chính");
            Scanner sc = new Scanner(System.in);
            System.out.println("Chọn loại sản phẩm cần hiển thị: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Danh sách máy tính ");
                    List<Computer> computers = computerService.findAll();
                    ComputerView.displayComputer(computers);
                    break;
                case 2:
                    System.out.println("Danh sách điện thoại ");
                    List<Phone> phones = phoneService.findAll();
                    PhoneView.displayPhone(phones);
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }

    public static void addProduct(){
        boolean flag = true;
        do {
            System.out.println("THÊM MỚI SẢN PHẨM" +
                    "\n 1. Thêm mới máy tính." +
                    "\n 2. Thêm mới điện thoại." +
                    "\n 3. Quay về menu chính");
            Scanner sc = new Scanner(System.in);
            System.out.println("Chọn loại sản phẩm cần thêm mới: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Điền thông tin của máy tính để thêm mới ");
                    Computer computer = ComputerView.inputDataForComputer();
                    computerService.add(computer);
                    System.out.println("Thêm máy tính mới thành công !");
                    break;
                case 2:
                    System.out.println("Điền thông tin của điện thoại để thêm mới ");
                    Phone phone = PhoneView.inputDataForPhone();
                    phoneService.add(phone);
                    System.out.println("Thêm điện thoại mới thành công !");

                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}