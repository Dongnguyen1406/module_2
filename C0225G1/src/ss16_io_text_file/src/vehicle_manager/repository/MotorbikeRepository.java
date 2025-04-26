package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.entity.Motorbike;
import vehicle_manager.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {
//    private static final ArrayList<Motorbike> motorbikes = new ArrayList<>();
    private final String MOTORBIKE_FILE = "src/vehicle_manager/data/motorbike.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
//    static {
//        motorbikes.add(new Motorbike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
//        motorbikes.add(new Motorbike(" 43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150));
//        motorbikes.add(new Motorbike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50));
//    }

    @Override
    public List<Motorbike> findAll() {
        List<Motorbike> motorbikes = new ArrayList<>();
        //đọc file
        List<String> stringList = ReadAndWriteFile.readFile(MOTORBIKE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Motorbike motorbike = new Motorbike(array[0], array[1], Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]));
            motorbikes.add(motorbike);
        }
        return motorbikes;
    }

    @Override
    public void add(Motorbike motorbike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motorbike.getInfoMotorbikeToFile());
        ReadAndWriteFile.writeFile(MOTORBIKE_FILE, stringList, APPEND);
    }

    @Override
    public boolean deleteByLicensePlateMotor(String licensePlate) {
        List<Motorbike> motorbikes = findAll();
        boolean check = false;
        for (int i = 0; i < motorbikes.size(); i++) {
            if (motorbikes.get(i) != null && motorbikes.get(i).getLicensePlate().equals(licensePlate)) {
                // Xóa phần tử, dời các phần tử sau lên
                check = true;
                motorbikes.remove(i);
                break;
            }
        }

        //chuyển cars => stringList
        List<String> stringList = new ArrayList<>();
        for (Motorbike m: motorbikes){
            stringList.add(m.getInfoMotorbikeToFile());
        }
        // ghi đè lại
        ReadAndWriteFile.writeFile(MOTORBIKE_FILE, stringList, NOT_APPEND);
        return check;
    }
}
