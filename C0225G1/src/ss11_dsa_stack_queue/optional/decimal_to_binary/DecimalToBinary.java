package ss11_dsa_stack_queue.optional.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thập phân: ");
        int decimal = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        
        int number = decimal;
        if(number == 0){
            System.out.println("Nhị phân: 0");
            return;
        }
        while (number > 0){
            int phanDu = number % 2;
            stack.push(phanDu);
            number /= 2;
        }
        
        String binary = "";
        while (!stack.isEmpty()){
            binary += stack.pop();
        }

        System.out.println("Số " + decimal + "ở hệ nghị phân là: " + binary);
    }
}
