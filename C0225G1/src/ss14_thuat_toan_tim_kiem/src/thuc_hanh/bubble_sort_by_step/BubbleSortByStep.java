package thuc_hanh.bubble_sort_by_step;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng số nguyên: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị:");
        for (int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }
        System.out.println("Danh sách các phần tử vừa nhập: ");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Bắt đầu quá trình sắp xếp: ");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
       boolean nextNeedPass = true;
       for (int i = 1; i < list.length && nextNeedPass; i++){
           nextNeedPass = false;
           for (int j = 0; j < list.length - i; j++){
               if (list[j] > list[j+1]){
                   System.out.println("Hoán đổi: " + list[j] + " với " + list[j+1]);
                   int temp = list[j];
                   list[j] = list[j +1];
                   list[j+1] = temp;
                   nextNeedPass = true;
               }
           }
           
           if (nextNeedPass == false){
               System.out.println("Mảng có thể đã được sắp xếp và không cần lần duyệt tiếp theo");
               break;
           }
           System.out.println("Danh sách sau lần thứ " + i + " sắp xếp: ");
           for (int j = 0; j < list.length; j++){
               System.out.print(list[j] + " ");
           }
           System.out.println();
           System.out.println();
       }
    }
}
