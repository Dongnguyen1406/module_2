package optional.tim_chuoi_lien_tiep_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxLengthSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String current = "";
        String max = "";
        
        current += str.charAt(0); // bắt đầu từ ký tự đầu tiên
        
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) >= str.charAt(i-1)){
                current += str.charAt(i);
            } else {
                if (current.length() > max.length()){
                    max = current;
                }
                current = "" + str.charAt(i);
            }
        }
        
        if (current.length() > max.length()){
            max = current;
        }
        
        System.out.println(max);
        sc.close();
    }
}
