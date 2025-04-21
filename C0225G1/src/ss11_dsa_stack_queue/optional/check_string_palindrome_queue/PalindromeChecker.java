package ss11_dsa_stack_queue.optional.check_string_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        
        char[] cleaned = str.toCharArray(); // tách ký tự
        
        for (char chars : cleaned){
            if(chars != ' '){
                stack.push(String.valueOf(chars).toLowerCase());
                queue.offer(String.valueOf(chars).toLowerCase());
            }
        }
        
        boolean result = isPalindrome(stack, queue);
        if(result){
            System.out.println("Đây là chuỗi Palindrome.");
        } else {
            System.out.println("Đây không phải chuỗi Palindrome.");
        }
    }
    
    public static boolean isPalindrome(Stack<String> stack, Queue<String> queue){
        while (!stack.isEmpty() && !queue.isEmpty()){
            String formStack = stack.pop();
            String formQueue = queue.poll();
            if(!formStack.equals(formQueue)){
                return false;
            }
        }
        return true;
    }
}
