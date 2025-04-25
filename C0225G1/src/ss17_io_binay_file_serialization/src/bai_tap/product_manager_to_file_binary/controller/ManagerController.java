package bai_tap.product_manager_to_file_binary.controller;

import java.util.Scanner;

public class ManagerController {
    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM" +
                    "\n 1. Thêm mới sản phẩm." +
                    "\n 2. Hiện thị sản phẩm." +
                    "\n 3. Tìm kiếm sản phẩm." +
                    "\n 4. Thoát");
            Scanner sc = new Scanner(System.in);

            System.out.println("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    ProductController.addProduct();
                    break;
                case 2:
                    ProductController.displayProduct();
                    break;
                case 3:
//                    ProductController.deleteVehicle();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
