package bai_tap.bai_tap_mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = {10, 4, 6, 7, 8, 6};
        int length = array.length;

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i< length; i++){
            System.out.print(array[i] + " ");
        }
                
        System.out.println("Nhập phần tử muốn xóa: ");
        int element = sc.nextInt();
        
        // tìm phần tử trong mảng
        int index_del = -1; // nếu bằng -1 là không tồn tại
        for (int i = 0; i < length; i++){
            if (array[i] == element){ // nếu bằng thì gán i cho index_del
                index_del = i;
                break;
            }
        }
        
        // xóa phần từ đó
        if (index_del != -1){
            for (int i = index_del; i < length -1; i++){
                array[i] = array[i+1]; // thay phần từ muốn xóa bằng phần tử kế tiếp nó
            }
            length--;
            System.out.print("Mảng sau khi xóa: ");
            for (int i = 0; i < length; i++){
                System.out.print(array[i] + " ");
            } 
        } else {
            System.out.println("Không tìm thấy phần từ trong mảng!");
        }
        
    }
}
