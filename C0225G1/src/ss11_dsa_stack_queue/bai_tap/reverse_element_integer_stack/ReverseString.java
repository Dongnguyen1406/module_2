package ss11_dsa_stack_queue.bai_tap.reverse_element_integer_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Tôi học Java";
        Stack<String> wStack = new Stack<>();
        
        String[] mWords = str.split(" ");
        
        for (String word : mWords){
            wStack.push(word);
        }
        
        String reversed = "";
        while (!wStack.isEmpty()){
            reversed += wStack.pop();
            if (!wStack.isEmpty()){
                reversed += " ";
            }
        }
        System.out.println("Chuỗi trước khi đảo từ: " + str);
        System.out.println("Chuỗi sau khi đảo từ: " + reversed);
    }
}
