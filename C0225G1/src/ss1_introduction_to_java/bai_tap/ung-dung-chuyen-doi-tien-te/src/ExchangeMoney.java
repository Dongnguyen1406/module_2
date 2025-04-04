import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double EXCHANGE = 23000;
        while (true){
            System.out.println("1. Tiền đô sang việt nam");
            System.out.println("2. Tiền việt nam sang đô");
            System.out.println("Vui lòng chọn tiền tệ muốn đổi!");
            int number = sc.nextInt();
            if (number == 0){
                break;
            }
            switch (number){
                case 1:
                    System.out.println("Nhập số tiền đô muốn đổi");
                    double usd = sc.nextDouble();
                    System.out.println("Số tiền sau khi chuyển đổi " + usd * EXCHANGE);
                    break;
                case 2:
                    System.out.println("Nhập số việt muốn đổi");
                    double vnd = sc.nextDouble();
                    System.out.println("Số tiền sau khi chuyển đổi " + vnd / EXCHANGE);
                    break;
            }
        }
       
    }
}
