package repository;

import entity.Vehicle;


public class VehicleRepository implements IVehicleRepository {
    private static CarRepository carRepository = new CarRepository();
    private static TruckRepository truckRepository = new TruckRepository();
    private static MotobikeRepository motorbikeRepository = new MotobikeRepository();

    public boolean deleteVehicleByControlPlate(String controlPlate) {
        // Xóa trong CarRepository
        for (Vehicle car : carRepository.findAll()) {
            if (car != null && car.getLicensePlate().equals(controlPlate)) {
                carRepository.deleteByControlPlateCar(controlPlate);
                return true;
            }
        }

        // Xóa trong TruckRepository
        for (Vehicle truck : truckRepository.findAll()) {
            if (truck != null && truck.getLicensePlate().equals(controlPlate)) {
                truckRepository.deleteByControlPlateTruck(controlPlate);
                return true;
            }
        }

        // Xóa trong MotorbikeRepository
        for (Vehicle motorbike : motorbikeRepository.findAll()) {
            if (motorbike != null && motorbike.getLicensePlate().equals(controlPlate)) {
                motorbikeRepository.deleteByControlPlateMotobike(controlPlate);
                return true;
            }
        }

        // Không tìm thấy phương tiện
        return false;
    }

}
