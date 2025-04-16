package repository;


import entity.Motobike;
import entity.Truck;

import java.util.Scanner;

public class MotobikeRepository implements IMotobikeRepository{
    private static Motobike[] motobikes = new Motobike[5];
    private static MotobikeRepository motorbikeRepository = new MotobikeRepository();

    static {
        motobikes[0] = new Motobike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A" , 100);
        motobikes[1] = new Motobike("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B" , 150);
        motobikes[2] = new Motobike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C" , 50);
    }

    @Override
    public Motobike[] findAll() {
        return motobikes;
    }

    @Override
    public void addMotobike(Motobike motobike){
        for (int i = 0; i < motobikes.length; i++){
            if(motobikes[i] == null){
                motobikes[i] = motobike;
                break;
            }
        }
    }

    @Override
    public void deleteByControlPlateMotobike(String licensePlate) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < motobikes.length; i++) {
            if (motobikes[i] != null && motobikes[i].getLicensePlate().equals(licensePlate)) {
                System.out.println("Bạn có muốn xóa hay không? (CÓ/KHÔNG)");
                String anwser = sc.nextLine();
                if (anwser.equalsIgnoreCase("CÓ")) {
                    // Dịch chuyển phần tử phía sau lên
                    for (int j = i; j < motobikes.length - 1; j++) {
                        motobikes[j] = motobikes[j + 1];
                    }
                    // Gán phần tử cuối cùng là null
                    motobikes[motobikes.length - 1] = null;
                    System.out.println("Đã xóa thành công!");
                }
                break;
            }
        }
    }
}
