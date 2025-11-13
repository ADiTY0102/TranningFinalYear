package DAY_10;

import java.util.Stack;

public class QuestionNo03 {
    String[] arr;
    int top;

    public QuestionNo03(int size) {
        arr = new String[size];
        top = -1;
    }

    void infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result.append(c);
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            } else { 
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
                    result.append(stack.pop());
                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop());

        System.out.println("Postfix expression: " + result.toString());
    }
    int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        QuestionNo03 obj = new QuestionNo03(20);
        String exp = "(a+b)*(a-b)";
        obj.infixToPostfix(exp);
    }
}
