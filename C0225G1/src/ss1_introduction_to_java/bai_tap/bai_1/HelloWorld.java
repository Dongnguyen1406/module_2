package ss1_introduction_to_java.bai_tap.bai_1;

import java.util.Scanner;

public class HelloWorld {
    // là hàm bắt đầu chạy chương trình
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = reader.nextInt(); // ép kiểu

        System.out.println("you entered: " + number);
        // khoảng trắng
        System.out.println(3 + 4 * 4);
    }


}
