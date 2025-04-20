package repository;

import entity.Truck;

import java.util.ArrayList;

public class TruckRepository implements ITruckRepository{
    private static final ArrayList<Truck> trucks = new ArrayList<>();
    static {
        trucks.add(new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3));
        trucks.add(new Truck("43C-47.678","Dongfeng",2020,"Nguyễn Văn B",9));
        trucks.add(new Truck("43C-45.235","Hino",2021,"Nguyễn Văn C",12));
    }

    @Override
    public ArrayList<Truck> findAll() {
        return new ArrayList<>(trucks);
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void deleteByLicensePlateTruck(String licensePlate) {
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getLicensePlate().equals(licensePlate)) {
                trucks.remove(i);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy biển kiểm soát!");
    }
}

