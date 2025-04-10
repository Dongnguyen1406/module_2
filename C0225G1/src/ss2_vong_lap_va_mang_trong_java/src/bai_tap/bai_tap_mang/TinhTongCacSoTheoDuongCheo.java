package bai_tap.bai_tap_mang;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TinhTongCacSoTheoDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng của ma trận vuông: ");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột của ma trận vuông: ");
        int cols = sc.nextInt();
        
        while (rows != cols){
            System.out.println("Nhập lại số hàng của ma trận vuông: ");
            rows = sc.nextInt();
            System.out.println("Nhập lại số cột của ma trận vuông: ");
            cols = sc.nextInt();
        }
        
        int[][] matrix = new int[rows][cols]; 

        System.out.println("Nhập các phần tử trong ma trận");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử dòng thứ " + i + " cột thứ " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma trận sau khi in: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        totalDiagonal(matrix, sc);
    }
    
    public static void totalDiagonal(int[][] matrix, Scanner sc){
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        for (int i = 0; i < matrix.length ; i++){
            sumLeftToRight += matrix[i][i];
                
        }
        for (int i = matrix.length-1; i >= 0 ; i--){
            sumRightToLeft += matrix[i][i];
            
        }
//        int total = sumLeftToRight + sumRightToLeft;
        System.out.println("Tổng các phần từ trong đường chéo của ma trận vuông: ");
        System.out.print(sumLeftToRight + sumRightToLeft);
    }
}
