import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Initializing an empty stack of integers with a maximum capacity of 10
        Stack<Integer> stack = new Stack<>();

        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());

        // Pushing integers onto the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println("Stack after pushing elements:");
        printStack(stack);

        // Popping elements from the stack
        System.out.println("\nPopping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("\nStack is empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }

    // Helper method to print the contents of the stack
    private static void printStack(Stack<Integer> stack) {
        System.out.print("Stack: ");
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
