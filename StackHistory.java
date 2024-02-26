import java.util.Scanner;
import java.util.Stack;

public class BrowserSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> historyStack = new Stack<>();

        while (true) {
            // Prompt the user to enter a URL or use the back button
            System.out.print("Enter a webpage URL or type 'back' to go back: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("back")) {
                // User wants to go back to the previous page
                if (!historyStack.isEmpty()) {
                    String previousPage = historyStack.pop();
                    System.out.println("Going back to: " + previousPage);
                } else {
                    System.out.println("No more history. Cannot go back.");
                }
            } else {
                // User is visiting a new page, push the URL onto the stack
                historyStack.push(userInput);
                System.out.println("Visiting: " + userInput);
            }

            // Print the current browsing history
            printHistory(historyStack);
        }
    }

    private static void printHistory(Stack<String> historyStack) {
        System.out.print("Browsing History: ");
        for (String url : historyStack) {
            System.out.print(url + " <- ");
        }
        System.out.println("[Top]");
    }
}
