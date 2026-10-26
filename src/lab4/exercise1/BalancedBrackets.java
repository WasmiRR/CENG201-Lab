package lab4.exercise1;

/**
 * Your Name:  Enes Atıcı
 * Your Student ID:  240444030
 * Your Date:  26.10.2026
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack.
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // If it is a closing bracket
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        // At the end, check whether the stack is empty.
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') return true;
        if (opening == '[' && closing == ']') return true;
        if (opening == '{' && closing == '}') return true;

        return false;
    }
}
