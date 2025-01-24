package Stacks_DSA;
import java.util.Stack;
public class InbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(15);
        stack.push(14); 
        stack.push(53);
        stack.push(33);
        stack.push(88);

        // pop will start printing from LIFO (Last in first out)
        for (int i = 0; i < stack.size(); i++) {
        System.out.print(stack.peek()+" ");    
        }
        


    }
    
}
