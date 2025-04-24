package vehicle_manager.view;

import vehicle_manager.entity.Motorbike;
import vehicle_manager.entity.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMotorbike(ArrayList<Motorbike> motorbikes) {
        if (motorbikes.isEmpty()) {
            System.out.println("Danh sách xe rỗng.");
            return;
        }
        for (Motorbike motorbike: motorbikes) {
            System.out.println(motorbike);
        }
    }

    public static Motorbike inputDataForMotorbike() {
        System.out.println("Chức năng thêm xe tải");
        Vehicle vehicle = VehicleView.inputVehicle();
        System.out.println("Nhập công suất");
        int power = Integer.parseInt(scanner.nextLine());
        Motorbike motorbike = new Motorbike(vehicle.getLicensePlate(), vehicle.getManufacturerName(), vehicle.getYearOfManufacture(), vehicle.getOwner(), power);
        return motorbike;
    }
}
