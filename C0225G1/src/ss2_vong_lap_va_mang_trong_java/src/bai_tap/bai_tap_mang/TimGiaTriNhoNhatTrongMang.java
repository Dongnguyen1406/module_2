package bai_tap.bai_tap_mang;

import java.sql.Array;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[3];
        
        for (int i = 0; i< array.length; i++){
            System.out.println("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }
      
        System.out.println();
        
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        
        System.out.println("Phần từ nhỏ nhất trong mảng là: " + min);
    }
}
