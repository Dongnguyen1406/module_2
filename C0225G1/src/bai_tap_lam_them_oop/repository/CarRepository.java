package repository;

import entity.Car;
import entity.Truck;

import java.util.Scanner;


public class CarRepository implements ICarRepository {
    private static Car[] cars = new Car[5];
    private static CarRepository carRepository = new CarRepository();

    static {
        cars[0] = new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", "Du lịch", 5);
        cars[1] = new Car("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", "Xe khách", 45);
        cars[2] = new Car("43B-453.89", "Ford", 2020, "Nguyễn Văn C", "Xe khách", 16);
    }

    @Override
    public Car[] findAll() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
        }
    }

    @Override
    public void deleteByControlPlateCar(String licensePlate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getLicensePlate().equals(licensePlate)) {
                // Xóa phần tử, dời các phần tử sau lên
                for (int j = i; j < cars.length - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                cars[cars.length - 1] = null;
                System.out.println("Đã xóa thành công!");
                break;
            }
        }
    }

}
