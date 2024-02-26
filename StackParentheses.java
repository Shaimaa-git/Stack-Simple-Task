import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {

    // Function to check if parentheses are balanced
    public static boolean areParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, parentheses are balanced
        return stack.isEmpty();
    }

    // Helper function to check if a pair of parentheses is matching
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for parentheses string
        System.out.print("Enter a string containing only parentheses: ");
        String inputString = scanner.nextLine();

        // Check if parentheses are balanced
        boolean result = areParenthesesBalanced(inputString);
        System.out.println("Is the string balanced? " + result);

        scanner.close();
    }
}
