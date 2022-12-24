package pr22;

import java.util.Stack;

public class RPNCalculator {
    private static final String Operators = "+-*/";

    public static double Calc(String expression) {
        if (expression.isEmpty()) {
            return 0;
        }

        int cursor = 0;
        Stack<Double> stack = new Stack<Double>();

        do {
            int space = expression.substring(cursor).indexOf(' ');
            int end = space == -1 ? expression.length() : cursor + space;
            String nextToken = expression.substring(cursor, end);
            char tokenStart = nextToken.charAt(0);

            if (Operators.indexOf(tokenStart) != -1) {
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(operation(tokenStart, a, b));
            } else {
                stack.push(Double.parseDouble(nextToken));
            }
            cursor = end + 1;
        } while (cursor < expression.length());

        double total = 0;
        while (!stack.isEmpty()) {
            double temp = stack.pop();
            total = Math.max(temp, total);
        }

        return total;
    }

    private static Double operation(char operator, Double a, Double b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }

        return (double) 0;
    }
}

