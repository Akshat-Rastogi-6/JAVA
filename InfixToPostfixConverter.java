import java.util.Stack;

public class InfixToPostfixConverter {
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "Invalid infix expression: Unmatched parentheses";
                }
                stack.pop(); // Pop the '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid infix expression: Unmatched parentheses";
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String infixExpression = "A + B * (C - D) / E";
        String postfixExpression = infixToPostfix(infixExpression);
        if (!postfixExpression.startsWith("Invalid")) {
            System.out.println("Infix Expression: " + infixExpression);
            System.out.println("Postfix Expression: " + postfixExpression);
        } else {
            System.out.println(postfixExpression);
        }
    }
}
