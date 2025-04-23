package bai_tap.illegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập 3 cạnh của một tam giác");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        while (true){
            try {
                System.out.println("Nhập cạnh a: ");
                a = sc.nextInt();
                System.out.println("Nhập cạnh b: ");
                b = sc.nextInt();
                System.out.println("Nhập cạnh c: ");
                c = sc.nextInt();
                check(a, b, c);
                System.out.println("3 cạnh vừa nhập: " + a + b + c + " là cạnh của một tam giác");
            } catch (IllegalTriangleExample e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("sai định dạng format " + e.getMessage());
            }
        }
    }

    public static boolean check(int a, int b, int c) throws IllegalTriangleExample{
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException("Các cạnh không được là số âm");
        } else if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalArgumentException("Tổng của 2 cạnh bất kì phải lớn hơn cạnh còn lại");
        }
        return true;
    }
}
