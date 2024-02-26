public class StaticStack {
    private static final int MAX_SIZE = 10;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public StaticStack() {
        stackArray = new int[MAX_SIZE];
        top = -1; // Initialize top to -1 indicating an empty stack
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Function to check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Function to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Function to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
        } else {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
        }
    }

    // Function to print the current state of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Current stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage:
        StaticStack stack = new StaticStack();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Print the current state of the stack
        stack.printStack();

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();

        // Attempt to pop from an empty stack
        stack.pop();
    }
}
