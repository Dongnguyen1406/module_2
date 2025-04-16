package controller;

import entity.Car;
import entity.Motobike;
import entity.Truck;
import repository.VehicleRepository;
import service.CarService;
import service.MotobikeService;
import service.TruckService;
import view.CarView;
import view.MotobikeView;
import view.TruckView;

import java.util.Scanner;

public class VehicleController {
    static TruckService truckService = new TruckService();
    static CarService carService = new CarService();
    static MotobikeService motobikeService = new MotobikeService();
    static VehicleRepository vehicleRepository = new VehicleRepository();
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
                    Truck[] trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                    break;
                case 2:
                    System.out.println("Danh sách xe oto ");
                    Car[] cars = carService.findAll();
                    CarView.displayCar(cars);
                    break;
                case 3:
                    System.out.println("Danh sách xe máy ");
                    Motobike[] motobikes = motobikeService.findAll();
                    MotobikeView.displayMotobike(motobikes);
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
                    Truck trucks = TruckView.inputDataForTruck();
                    truckService.addTruck(trucks);
                    System.out.println("Thêm xe tải mới thành công !");
                    break;
                case 2:
                    System.out.println("Điền thông tin của xe oto để thêm mới ");
                    Car cars = CarView.inputDataForCar();
                    carService.addCar(cars);
                    System.out.println("Thêm xe oto mới thành công !");

                    break;
                case 3:
                    System.out.println("Điền thông tin của xe máy để thêm mới ");
                    Motobike motobikes = MotobikeView.inputDataForMotobike();
                    motobikeService.addMotobike(motobikes);
                    System.out.println("Thêm xe máy mới thành công !");
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }

    public static void deleteVehicle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số muốn xóa: ");
        String licensePlate = sc.nextLine();
        
        
        vehicleRepository.deleteVehicleByControlPlate(licensePlate);
    }
    
}
