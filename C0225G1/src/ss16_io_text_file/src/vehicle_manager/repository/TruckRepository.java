package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Truck;
import vehicle_manager.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository{
//    private static final ArrayList<Truck> trucks = new ArrayList<>();
    private final String TRUCK_FILE = "src/vehicle_manager/data/truck.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
//    static {
//        trucks.add(new Truck("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3));
//        trucks.add(new Truck("43C-47.678","Dongfeng",2020,"Nguyễn Văn B",9));
//        trucks.add(new Truck("43C-45.235","Hino",2021,"Nguyễn Văn C",12));
//    }

    @Override
    public List<Truck> findAll() {
        List<Truck> trucks = new ArrayList<>();
        //đọc file
        List<String> stringList = ReadAndWriteFile.readFile(TRUCK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]));
            trucks.add(truck);
        }
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.getInfoTruckToFile());
        ReadAndWriteFile.writeFile(TRUCK_FILE, stringList, APPEND);
    }

    @Override
    public boolean deleteByLicensePlateTruck(String licensePlate) {
        List<Truck> trucks = findAll();
        boolean check = false;
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i) != null && trucks.get(i).getLicensePlate().equals(licensePlate)) {
                // Xóa phần tử, dời các phần tử sau lên
                check = true;
                trucks.remove(i);
                break;
            }
        }

        //chuyển cars => stringList
        List<String> stringList = new ArrayList<>();
        for (Truck t: trucks){
            stringList.add(t.getInfoTruckToFile());
        }
        // ghi đè lại
        ReadAndWriteFile.writeFile(TRUCK_FILE, stringList, NOT_APPEND);
        return check;
    }
}
