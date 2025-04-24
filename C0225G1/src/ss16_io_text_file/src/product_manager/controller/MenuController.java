package product_manager.controller;

import product_manager.view.ProductView;

import java.util.Scanner;

public class MenuController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("\n=== QUẢN LÝ SẢN PHẨM ===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị sản phẩm");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("7. Sắp xếp giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhập thông tin để thêm sản phẩm");
                    ProductView.addProduct();
                    break;
                case 2:
                    System.out.println("Sửa sản phẩm theo ID");
                    ProductView.updateProduct();
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm theo ID");
                    ProductView.deleteProduct();
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm");
                    ProductView.displayProducts();
                    break;
                case 5:
                    System.out.println("Tìm kiếm theo tên sản phẩm");
                    ProductView.searchProduct();
                    break;
                case 6:
                    System.out.println("Sắp xếp tăng dần giá");
                    ProductView.sortAscending();
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần giá");
                    ProductView.sortDescending();
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
}
