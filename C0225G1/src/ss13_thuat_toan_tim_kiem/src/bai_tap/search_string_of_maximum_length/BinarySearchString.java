package bai_tap.search_string_of_maximum_length;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        
        String string1 = "";

        for (int i = 0; i < str.length(); i++){
            String string2 = "";
            string2 = str.charAt(i)+"";
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(j) > string2.charAt(string2.length()-1)){
                    string2 += str.charAt(j);
                }
            }
            if (string2.length() > string1.length()){
                string1 = string2;
            }
        }

        System.out.println(string1);
        
//        List<Character> max = new ArrayList<>();
//        
//        for (int i = 0; i < str.length(); i++){
//            List<Character> list = new ArrayList<>();
//            list.add(str.charAt(i));
//            for (int j = i+1; j < str.length(); j++){
//                if (str.charAt(j) > list.get(list.size()-1)){
//                    list.add(str.charAt(j));
//                }
//            }
//            if (list.size() > max.size()){
//                max.clear();
//                max.addAll(list);
//            }
//            list.clear();
//        }
//        for (Character ch : max){
//            System.out.print(ch);
//        }
//        System.out.println();
    }
}