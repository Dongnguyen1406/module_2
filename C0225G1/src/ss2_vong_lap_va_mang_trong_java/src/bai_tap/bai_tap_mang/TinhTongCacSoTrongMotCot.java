package bai_tap.bai_tap_mang;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TinhTongCacSoTrongMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng đa chiều: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của mảng đa chiều: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Nhập các phần từ cho ma trận: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử dòng thứ " + i + " cột thứ " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng sau khi in: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        int result = totalCol(matrix, sc);
        System.out.println(result);
    }
    
    public static int totalCol(int[][] matrix, Scanner sc){
        System.out.println("Nhập cột muốn tính tổng: ");
        int colToSum = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum+= matrix[i][colToSum];
                break;
            }
        }
        return sum;
    }
}
