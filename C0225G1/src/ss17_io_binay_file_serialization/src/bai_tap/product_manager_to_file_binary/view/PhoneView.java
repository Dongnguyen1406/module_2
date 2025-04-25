package bai_tap.product_manager_to_file_binary.view;

import bai_tap.product_manager_to_file_binary.entity.Computer;
import bai_tap.product_manager_to_file_binary.entity.Phone;
import bai_tap.product_manager_to_file_binary.entity.Product;

import java.util.List;
import java.util.Scanner;

public class PhoneView {
    private static Scanner sc = new Scanner(System.in);
    public static void displayPhone(List<Phone> phones){
        if(phones.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }

        for (Phone phone : phones){
            System.out.println(phone);
        }
    }

    public static Phone inputDataForPhone(){
        System.out.println("Chức năng thêm điện thoại");
        Product product = ProductView.inputProduct();
        System.out.println("Nhập loại hệ điều hành): ");
        String phoneOS = sc.nextLine();
        Phone phone = new Phone(product.getId(), product.getName(), product.getPrice(), product.getManufacturer(), product.getDescription(), phoneOS);
        return phone;
    }
}
