package view;

import entity.Car;

import java.util.Scanner;

public class CarView {
    private static Scanner sc = new Scanner(System.in);
    public static void displayCar(Car[] cars){
        for (int i = 0; i < cars.length; i++){
            if (cars[i]!=null){
                System.out.println(cars[i]);
            } else {
                break;
            }
        }
    }

    public static Car inputDataForCar(){
        System.out.println("Chức năng thêm mới xe oto");

        System.out.println("Nhập biển kiểm soát");
        String licensePlate = sc.nextLine();

        System.out.println("Nhập nhà sản xuất");
        String manufacturerName = sc.nextLine();

        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chủ sở hữu");
        String owner = sc.nextLine();

        System.out.println("Nhập loại xe oto");
        String vehicleType = sc.nextLine();

        System.out.println("Nhập số chỗ ngồi");
        int numberOfSeats = Integer.parseInt(sc.nextLine());

        Car car = new Car(licensePlate, manufacturerName, yearOfManufacture, owner, vehicleType, numberOfSeats);
        return car;
    }
    
    
}
//vehicleType, numberOfSeats