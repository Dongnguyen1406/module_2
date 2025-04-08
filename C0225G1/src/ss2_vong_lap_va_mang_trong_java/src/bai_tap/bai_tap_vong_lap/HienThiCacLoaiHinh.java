package bai_tap.bai_tap_vong_lap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Vui lòng chọn chức năng: ");
            int number = sc.nextInt();
            if (number == 4) {
                break;
            }
            switch (number) {
                case 1:
                    int chieuRong;
                    do {
                        System.out.println("Nhập chiều rộng lớn hơn 0!");
                        chieuRong = sc.nextInt();
                    } while (chieuRong <= 0);
                    
                    int chieuDai;
                    do {
                        System.out.println("Nhập chiều dài lớn hơn 0!");
                        chieuDai = sc.nextInt();
                    } while (chieuDai <= 0);
                    
                    for (int i = 0; i < chieuRong; i++) { // in dòng
                        for (int j = 0; j < chieuDai; j++) { // in cột
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;


                case 2:
                    while (true){
                        System.out.println("1. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở top-left");
                        System.out.println("Vui lòng chọn hình tam giác muốn in: ");
                        number = sc.nextInt();
                        
                        switch (number){
                            case 1:
                                for (int i = 1; i <= 5; i++){
                                    for (int j = 1; j < i; j++){
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 7; i >= 1; i--){
                                    for (int j = 1; j <= i; j++){
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Bạn đã nhập chức năng quá (1 - 2)! Vui lòng nhập lại");
                        }
                        break;
                    }
                    break;
                case 3:
                    int chieuCao;
                    do {
                        System.out.println("Nhập chiều cao lớn hơn 0!: ");
                        chieuCao = sc.nextInt();
                    } while (chieuCao <= 0);

                    for (int i = 1; i <= chieuCao; i++) {
                        for (int j = 1; j <= chieuCao - i; j++) {
                            System.out.print("  "); 
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Bạn đã nhập chức năng quá (1 -4)! Vui lòng nhập lại");
            }
        }
    }
}
