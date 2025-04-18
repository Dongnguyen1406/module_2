package repository;

import entity.Car;
import entity.Truck;

import java.util.ArrayList;
import java.util.Scanner;


public class CarRepository implements ICarRepository {
//    private static Car[] cars = new Car[5];
    private static ArrayList<Car> cars = new ArrayList<>();
    private static CarRepository carRepository = new CarRepository();

    static {
        cars.add(new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", "Du lịch", 5));
        cars.add(new Car("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", "Xe khách", 45));
        cars.add(new Car("43B-453.89", "Ford", 2020, "Nguyễn Văn C", "Xe khách", 16));
    }

    @Override
    public ArrayList<Car> findAll() {
        return new ArrayList<>(cars);
    }

    @Override
    public void addCar(Car car) {
       cars.add(car);
    }

    @Override
    public void deleteByControlPlateCar(String licensePlate) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null && cars.get(i).getLicensePlate().equals(licensePlate)) {
                // Xóa phần tử, dời các phần tử sau lên
                cars.remove(i);
                System.out.println("Đã xóa thành công!");
                break;
            }
        }
    }

}
