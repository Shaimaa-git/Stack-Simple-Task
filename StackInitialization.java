import java.util.Arrays;
import java.util.Stack;

public class SimpleStackExample {
    public static void main(String[] args) {
        // Initialize an empty stack with a capacity of 10
        Stack<Integer> stack = new Stack<>();
        //make the stack empty
        stack.empty(); 
        //use for loop to set the size of stack up to 10
        for(int i=0;i>10;i++) {
            stack.push(i);
        }
        //print the empty stack
        System.out.println(stack);

        }
    }

