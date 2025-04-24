package vehicle_manager.view;

import vehicle_manager.common.ManufactureList;
import vehicle_manager.entity.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private static final Scanner scanner = new Scanner(System.in);
    public static Vehicle inputVehicle() {
        System.out.println("Nhập biển số xe: ");
        String licensePlate = scanner.nextLine();

        System.out.println("Chọn hãng sản xuất từ danh sách sau:");
        for (int i = 0; i < ManufactureList.manufactureList.size(); i++) {
            String[] parts = ManufactureList.manufactureList.get(i).split(",");
            System.out.println((i + 1) + ". " + parts[1] + " - " + parts[2]);
        }

        int choice;
        while (true) {
            System.out.print("Nhập số tương ứng với hãng sản xuất: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= ManufactureList.manufactureList.size()) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập số trong khoảng từ 1 đến " + ManufactureList.manufactureList.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi định dạng! Vui lòng nhập số.");
            }
        }

        String[] selectedManufacture = ManufactureList.manufactureList.get(choice - 1).split(",");
        String manufactureName = selectedManufacture[1].trim();
        System.out.println("Nhập năm sản xuất: ");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu: ");
        String ownerPerson = scanner.nextLine();
        return new Vehicle(licensePlate,manufactureName,manufactureYear,ownerPerson);
    }
    public static String inputControlPlate() {
        System.out.println("Nhập biển kiểm soát: ");
        return scanner.nextLine();
    }

    public static boolean confirmDelete() {
        System.out.print("Bạn có muốn xóa hay không? (CÓ/KHÔNG): ");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("CÓ");
    }
}
