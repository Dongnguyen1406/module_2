package ss11_dsa_stack_queue.bai_tap.reverse_element_integer_stack;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();

        System.out.println("Mảng trước khi đảo ngược: ");
        for (int num : arr){
            System.out.print(num + "");
        }
        System.out.println();
        
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }
        
        System.out.println("Mảng sau khi đảo ngược: ");
        for (int num : arr){
            System.out.print(num + "");
        }
    }
}
