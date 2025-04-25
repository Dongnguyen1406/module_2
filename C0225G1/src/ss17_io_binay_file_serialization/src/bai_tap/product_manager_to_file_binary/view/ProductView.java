package bai_tap.product_manager_to_file_binary.view;

import bai_tap.product_manager_to_file_binary.controller.ProductController;
import bai_tap.product_manager_to_file_binary.entity.Product;

import java.util.Scanner;

public class ProductView {
   private static final Scanner sc = new Scanner(System.in);
   public static Product inputProduct(){
       System.out.println("Nhập id: ");
       int id = Integer.parseInt(sc.nextLine());

       System.out.println("Nhập tên: ");
       String name = sc.nextLine();

       System.out.println("Nhập giá: ");
       Double price = Double.parseDouble(sc.nextLine());

       System.out.println("Nhập hãng sx: ");
       String manufacturer = sc.nextLine();

       System.out.println("Nhập mô tả: ");
       String description = sc.nextLine();
       
       return new Product(id, name, price, manufacturer, description);
   }
}
