package bai_tap.bai_tap_mang;

import java.util.Scanner;

public class TimPhanTuLonNhatMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

      
        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử tại [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        
        System.out.println("Phần tử lớn nhất trong mảng đa chiều là: " + max + " tại mảng " + maxRow + " vị trí " + maxCol);
    }
}
