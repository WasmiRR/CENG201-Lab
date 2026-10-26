package lab4.exercise2;

/**
 * EquationReverser.java
 * Your Name:        Enes Atıcı
 * Your Student ID:  240444030
 * Your Date:        26.10.2026
 */

public class EquationReverser {

    // Method is static so it can be called without instantiating the class
    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;

        while (i < equation.length()) {
            char current = equation.charAt(i);

            // If the current character is a digit
            if (Character.isDigit(current)) {
                int start = i;
                // Move forward until the number ends
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                // Push the whole number as one item
                stack.push(equation.substring(start, i));
            } else {
                // Otherwise, push the operator
                stack.push(String.valueOf(current));
                i++;
            }
        }

        // Pop all items from the stack and append them to a StringBuilder
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
