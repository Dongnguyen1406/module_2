package bai_tap.bai_tap_vong_lap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers;
        do{
            System.out.println("Nhập số lượng số nguyên tố cần in ra lớn hơn 0: ");
            numbers = sc.nextInt();
        } while (numbers <= 0);
        
        System.out.println("Các số nguyên tố đầu tiên là:" );
        
        int count = 0;
        int N = 2;
        while (count < numbers){
           int soUocSNT = 0;
           for (int i = 1; i <= N; i++){
               if (N % i == 0){
                   soUocSNT++;
               }
           }
           if (soUocSNT == 2){
               count++;
               System.out.println(N);
           }
           N++;
        }
    }
}
