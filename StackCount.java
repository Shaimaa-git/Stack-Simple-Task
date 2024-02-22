import java.util.Stack;

public class StackElementCounter {

    // Function to count elements in a stack without removing any of them
    public static int countElements(Stack<Integer> stack) {
        // Create a temporary stack to hold elements
        Stack<Integer> tempStack = new Stack<>();

        // Move elements from the original stack to the temporary stack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // Count the number of elements in the temporary stack
        int count = tempStack.size();

        // Move the elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        // Return the count of elements
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        // Call the countElements function and print the result
        int result = countElements(myStack);
        System.out.println("Number of elements in the stack: " + result);
    }
}
