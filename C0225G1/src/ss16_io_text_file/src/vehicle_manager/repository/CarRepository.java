package vehicle_manager.repository;

import vehicle_manager.entity.Car;
import vehicle_manager.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final String CAR_FILE = "src/vehicle_manager/data/car.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
//    private static CarRepository carRepository = new CarRepository();


//    static {
//        cars.add(new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", "Du lịch", 5));
//        cars.add(new Car("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", "Xe khách", 45));
//        cars.add(new Car("43B-453.89", "Ford", 2020, "Nguyễn Văn C", "Xe khách", 16));
//    }

    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        //đọc file
        List<String> stringList = ReadAndWriteFile.readFile(CAR_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], Integer.parseInt(array[5]));
            cars.add(car);
        }
        return cars;
    }

    @Override
    public void addCar(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfoCarToFile());
        ReadAndWriteFile.writeFile(CAR_FILE, stringList, APPEND);
    }

    @Override
    public boolean deleteByLicensePlateCar(String licensePlate) {
        List<Car> cars = findAll();
        boolean check = false;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null && cars.get(i).getLicensePlate().equals(licensePlate)) {
                // Xóa phần tử, dời các phần tử sau lên
                check = true;
                cars.remove(i);
                break;
            }
        }
        
        //chuyển cars => stringList
        List<String> stringList = new ArrayList<>();
        for (Car c: cars){
            stringList.add(c.getInfoCarToFile());
        }
        // ghi đè lại
        ReadAndWriteFile.writeFile(CAR_FILE, stringList, NOT_APPEND);
        return check;
    }
}
