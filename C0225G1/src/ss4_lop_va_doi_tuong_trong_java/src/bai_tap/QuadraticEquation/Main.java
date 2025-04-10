package bai_tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm kép:");
            System.out.println("x = " + equation.getRoot1()); // hoặc getRoot2() cũng được
        } else {
            System.out.println("The equation has no roots.");
        }

        scanner.close();
    }
}
