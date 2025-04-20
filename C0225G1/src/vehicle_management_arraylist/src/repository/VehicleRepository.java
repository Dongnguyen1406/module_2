package repository;

import entity.Vehicle;

public class VehicleRepository implements IVehicleRepository{
    private static CarRepository carRepository = new CarRepository();
    private static TruckRepository truckRepository = new TruckRepository();
    private static MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    public boolean deleteVehicleByLicensePlate(String licensePlate) {
        // Xóa trong CarRepository
        for (Vehicle car : carRepository.findAll()) {
            if (car.getLicensePlate().equals(licensePlate)) {
                carRepository.deleteByLicensePlateCar(licensePlate);
                return true;
            }
        }

        // Xóa trong TruckRepository

        for (Vehicle truck : truckRepository.findAll()) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                truckRepository.deleteByLicensePlateTruck(licensePlate);
                return true;
            }
        }

        // Xóa trong MotorbikeRepository
        for (Vehicle motorbike : motorbikeRepository.findAll()) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                motorbikeRepository.deleteByLicensePlateMotor(licensePlate);
                return true;
            }
        }

        // Không tìm thấy phương tiện
        return false;
    }
}
