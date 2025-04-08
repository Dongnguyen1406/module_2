package bai_tap.bai_tap_mang;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "okokok";

        System.out.println("Nhập ký tự muốn kiểm tra: ");
        char kyTu = sc.next().charAt(0); // nếu nhập vào chuỗi thì sẽ kiểm tra ký tự đầu tiên của chuỗi đó
        
        int count = 0;
       
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == kyTu){
                count++;
            }
        }
        
        System.out.println("Ký tự " + kyTu + " xuất hiện " + count);
        
    }
}
