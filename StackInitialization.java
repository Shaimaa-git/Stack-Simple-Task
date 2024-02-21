import java.util.Stack;

public class SimpleStackExample {
    public static void main(String[] args) {
        // Initialize an empty stack with a capacity of 10
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int i = 1; i <= 5; i++) {
            pushElement(stack, i);
        }

        // Pop elements from the stack
        for (int i = 1; i <= 5; i++) {
            popElement(stack);
        }
    }

    // Method to push an element onto the stack
    private static void pushElement(Stack<Integer> stack, int element) {
        if (stack.size() < 10) {
            stack.push(element);
            System.out.println("Pushed: " + element);
        } else {
            System.out.println("Stack is full. Cannot push element: " + element);
        }
    }

    // Method to pop an element from the stack
    private static void popElement(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped: " + poppedElement);
        } else {
            System.out.println("Stack is empty. Cannot pop element.");
        }
    }
}
