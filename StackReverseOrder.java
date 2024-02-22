import java.util.Scanner;
import java.util.Stack;

public class ReverseOrderPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements (N) from the user
        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();

        // Create a stack to store the numbers
        Stack<Integer> numberStack = new Stack<>();

        // Read N numbers from the user and push them onto the stack
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numberStack.push(num);
        }

        // Print the numbers in reverse order by popping them from the stack
        System.out.println("Numbers in reverse order:");
        while (!numberStack.isEmpty()) {
            int num = numberStack.pop();
            System.out.println(num);
        }

        scanner.close();
    }
}
