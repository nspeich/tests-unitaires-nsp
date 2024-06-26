import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        String input = "20 5 /"; 
        double result = evaluateRPN(input);
        System.out.println("Résultat : " + result);
    }

    public static double evaluateRPN(String input) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = input.split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { 
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            }
        }

        return stack.pop(); 
    }

    public static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                throw new IllegalArgumentException("Opérateur inconnu : " + operator);
        }
    }
}
