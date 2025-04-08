package bai_tap.bai_tap_mang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int numbers = sc.nextInt();
        
        int[] array = new int[10];
        for (int i = 0; i < numbers; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < numbers; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.print("Nhập giá trị cần chèn: ");
        int newValue = sc.nextInt();
        
        System.out.println("Nhập vị trí cần chèn (index): ");
        int index = sc.nextInt();
        
        if (index < 0 || index > numbers || numbers >= array.length){
            System.out.println("không chèn được phần tử vào mảng.");
        } else {
            for (int i = numbers; i < index; i--){
                array[i] = array[i - 1];
            }
            array[index] = newValue;
            numbers++; // Tăng số lượng phần tử sau khi chèn
            
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i< numbers; i++){
                System.out.print(array[i] + " ");
                
            }
        }
    }
}
