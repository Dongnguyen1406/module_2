package controller;

import entity.Car;
import entity.Motorbike;
import entity.Truck;
import repository.VehicleRepository;
import service.CarService;
import service.MotorbikeService;
import service.TruckService;
import view.CarView;
import view.MotorbikeView;
import view.TruckView;
import view.VehicleView;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CarService carService = new CarService();
    private static final TruckService truckService = new TruckService();
    private static final MotorbikeService motorbikeService = new MotorbikeService();
    private static final VehicleRepository vehicleRepository = new VehicleRepository();

    public static void displayVehicle(){
        boolean flag = true;
        do {
            System.out.println("HIỂN THỊ PHƯƠNG TIỆN" +
                    "\n 1. Hiển thị xe tải." +
                    "\n 2. Hiển thị oto." +
                    "\n 3. Hiển thị xe máy." +
                    "\n 4. Quay về menu chính");
            Scanner sc = new Scanner(System.in);
            System.out.println("Chọn loại phương tiện cần hiển thị: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Danh sách xe tải ");
                    ArrayList<Truck> trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                    break;
                case 2:
                    System.out.println("Danh sách xe oto ");
                    ArrayList<Car> cars = carService.findAll();
                    CarView.displayCar(cars);
                    break;
                case 3:
                    System.out.println("Danh sách xe máy ");
                    ArrayList<Motorbike> motorbikes = motorbikeService.findAll();
                    MotorbikeView.displayMotorbike(motorbikes);
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }

    public static void addVehicle(){
        boolean flag = true;
        do {
            System.out.println("THÊM MỚI PHƯƠNG TIỆN" +
                    "\n 1. Thêm mới xe tải." +
                    "\n 2. Thêm mới oto." +
                    "\n 3. Thêm mới xe máy." +
                    "\n 4. Quay về menu chính");
            Scanner sc = new Scanner(System.in);
            System.out.println("Chọn loại phương tiện cần thêm mới: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Điền thông tin của xe tải để thêm mới ");
                    Truck truck = TruckView.inputDataForTruck();
                    truckService.add(truck);
                    System.out.println("Thêm xe tải mới thành công !");
                    break;
                case 2:
                    System.out.println("Điền thông tin của xe oto để thêm mới ");
                    Car car = CarView.inputDataForCar();
                    carService.add(car);
                    System.out.println("Thêm xe oto mới thành công !");

                    break;
                case 3:
                    System.out.println("Điền thông tin của xe máy để thêm mới ");
                    Motorbike motorbike = MotorbikeView.inputDataForMotorbike();
                    motorbikeService.add(motorbike);
                    System.out.println("Thêm xe máy mới thành công !");
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }

    public static void deleteVehicle() {
        String licensePlate = VehicleView.inputControlPlate();
        
        if (!VehicleView.confirmDelete()) {
            System.out.println("Hủy thao tác xóa.");
            return;
        }
        
        boolean result = vehicleRepository.deleteVehicleByLicensePlate(licensePlate);
        if (result) {
            System.out.println("Xóa thành công phương tiện với biển kiểm soát: " + licensePlate);
        } else {
            System.out.println("Không tìm thấy phương tiện với biển kiểm soát: " + licensePlate);
        }
    }
}
