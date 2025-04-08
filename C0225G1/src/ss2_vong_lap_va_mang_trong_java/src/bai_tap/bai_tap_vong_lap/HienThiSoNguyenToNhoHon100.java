package bai_tap.bai_tap_vong_lap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int number){
        if (number < 2 ){
            return false;
        }
//        hoặc dùng Math.sqrt(number)
        for (int i = 2; i <= number / 2 ; i++){
            if (number % i == 0){
                return false; // chia hết không phải số nguyên tố
            }
        }
        
        return true;
    }
}


