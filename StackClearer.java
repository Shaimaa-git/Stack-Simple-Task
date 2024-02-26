import java.util.Stack;

public class StackClearer {

    // Function to clear all elements from a stack
    public static void clearStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is already empty. Nothing to clear.");
        } else {
            stack.clear();
            System.out.println("Stack cleared successfully.");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        Stack<Integer> myStack = new Stack<>();

        // Push elements onto the stack
        myStack.push(5);
        myStack.push(10);
        myStack.push(15);

        // Print the current state of the stack
        System.out.println("Original stack:");
        System.out.println(myStack);

        // Clear the stack
        clearStack(myStack);

        // Attempt to clear an already empty stack
        clearStack(myStack);
    }
}
