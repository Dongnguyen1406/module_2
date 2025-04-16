package controller;

import service.TruckService;

import java.util.Scanner;

public class MenuController {
    public static void displayMenu() {
        boolean flag = true;
        do{
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "\n 1. Thêm mới phương tiện." +
                    "\n 2. Hiện thị phương tiện" +
                    "\n 3. Xóa phương tiện" +
                    "\n 4. Thoát");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    VehicleController.addVehicle();
                    break;
                case 2:
                    VehicleController.displayVehicle();
                    break;
                case 3:
                    VehicleController.deleteVehicle();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
