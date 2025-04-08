package bai_tap.bai_tap_mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array1[i] = sc.nextInt();
        }
        System.out.print("Mảng 1: ");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        
        int[] array2 = new int[3];
        for (int i = 0; i < array2.length; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array2[i] = sc.nextInt();
        }
        System.out.print("Mảng 2: ");
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        
        int[] array3 = new int[array1.length + array2.length];
        
        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i]; // Gộp mảng 1 vào mảng 3
        }
        
        for (int i = 0; i < array2.length; i++){
            array3[array1.length + i] = array2[i]; // Gộp mảng 2 vào mảng 3 tiếp theo sau mảng 1
        }

        System.out.print("Mảng sau khi gộp là: ");
        for(int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }
        
    }
}
