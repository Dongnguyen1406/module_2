package view;

import entity.Car;
import entity.Truck;
import entity.Vehicle;

import java.util.Scanner;

public class TruckView {
    private static Scanner sc = new Scanner(System.in);
    public static void displayTruck(Truck[] trucks){
        for (int i = 0; i < trucks.length; i++){
            if (trucks[i]!=null){
                System.out.println(trucks[i]);
            } else {
                break;
            }
        }
    }
    
    public static Truck  inputDataForTruck(){
        System.out.println("Chức năng thêm mới xe tải");
        
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = sc.nextLine();
        
        System.out.println("Nhập nhà sản xuất");
        String manufacturerName = sc.nextLine();
        
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhập chủ sở hữu");
        String owner = sc.nextLine();
        
        System.out.println("Nhập tải trọng");
        double loadCapacity = Integer.parseInt(sc.nextLine());

        Truck truck = new Truck(licensePlate, manufacturerName, yearOfManufacture, owner, loadCapacity);
        return truck;
    }
    
    
}

//licensePlate, manufacturerName, yearOfManufacture, owner
