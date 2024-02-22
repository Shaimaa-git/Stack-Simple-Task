import java.util.Scanner;
import java.util.Stack;

public class TextEditor {

    public static void main(String[] args) {
        Stack<Character> textStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type characters (press 'undo' to undo):");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("undo")) {
                // User wants to undo the last character
                if (!textStack.isEmpty()) {
                    textStack.pop();
                }
            } else {
                // User types a character, push it onto the stack
                for (char c : userInput.toCharArray()) {
                    textStack.push(c);
                }
            }

            // Print the current state of the text
            printText(textStack);
        }
    }

    private static void printText(Stack<Character> textStack) {
        System.out.print("Current text: ");
        for (char c : textStack) {
            System.out.print(c);
        }
        System.out.println();
    }
}
