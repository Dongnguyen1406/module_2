package bai_tap.access_modifier.product_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while(true){
            System.out.println("----- Quản lý sản phẩm-----");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Cập nhập sản phẩm");
            System.out.println("5. Thoát");

            System.out.println("Nhập số để chọn dịch vụ: ");
            int number = sc.nextInt();
            if (number == 5){
                System.out.println("Dừng chương trình thành công");
                break;
            }
            switch (number){
                case 1:
                    System.out.println("---Danh sách sản phẩm----");
                    productManager.display();
                    break;
                case 2:
                    System.out.println("---Thêm sản phẩm----");
                    productManager.add();
                    break;
                case 3:
                    System.out.println("---Xóa sản phẩm----");
                    productManager.delete();
                    break;
                case 4:
                    System.out.println("---Sửa sản phẩm----");
                    productManager.edit();
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 - 5");
            }
        }
        
    }
    
    
}
