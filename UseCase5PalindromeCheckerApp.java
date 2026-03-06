import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        Stack<Character> stack = new Stack<>();
        String reversed = "";

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is not a Palindrome.");
        }
    }
}