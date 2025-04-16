package view;


import entity.Motobike;

import java.util.Scanner;

public class MotobikeView {
    private static Scanner sc = new Scanner(System.in);
    public static void displayMotobike(Motobike[] motobikes){
        for (int i = 0; i < motobikes.length; i++){
            if (motobikes[i]!=null){
                System.out.println(motobikes[i]);
            } else {
                break;
            }
        }
    }

    public static Motobike inputDataForMotobike(){
        System.out.println("Chức năng thêm mới xe máy");

        System.out.println("Nhập biển kiểm soát");
        String licensePlate = sc.nextLine();

        System.out.println("Nhập nhà sản xuất");
        String manufacturerName = sc.nextLine();

        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chủ sở hữu");
        String owner = sc.nextLine();

        System.out.println("Nhập công suất");
        double enginePower = Integer.parseInt(sc.nextLine());

        Motobike motobike = new Motobike(licensePlate, manufacturerName, yearOfManufacture, owner, enginePower);
        return motobike;
    }
}
