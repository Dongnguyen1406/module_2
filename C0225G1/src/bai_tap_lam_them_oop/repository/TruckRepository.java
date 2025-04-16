package repository;


import entity.Truck;

import java.util.Scanner;

public class TruckRepository implements ITruckRepository {
    // kết nối DB hoặc đọc ghi file
    private static Truck[] trucks = new Truck[5];
    private static TruckRepository truckRepository = new TruckRepository();

    static {
        trucks[0] = new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3);
        trucks[1] = new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9);
        trucks[2] = new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12);
    }

    @Override
    public Truck[] findAll() {
        return trucks;
    }
    
    @Override
    public void addTruck(Truck truck){
        for (int i = 0; i < trucks.length; i++){
            if(trucks[i] == null){
                trucks[i] = truck;
                break;
            }
        }
    }

    @Override
    public void deleteByControlPlateTruck(String licensePlate) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] != null && trucks[i].getLicensePlate().equals(licensePlate)) {
                System.out.println("Bạn có muốn xóa hay không? (CÓ/KHÔNG)");
                String anwser = sc.nextLine();
                if (anwser.equalsIgnoreCase("CÓ")) {
                    // Dịch chuyển phần tử phía sau lên
                    for (int j = i; j < trucks.length - 1; j++) {
                        trucks[j] = trucks[j + 1];
                    }
                    // Gán phần tử cuối cùng là null
                    trucks[trucks.length - 1] = null;
                    System.out.println("Đã xóa thành công!");
                }
                break;
            }
        }
    }

}
