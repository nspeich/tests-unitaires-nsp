import java.util.*;

public class RPNCalculator {
    public static void main(String[] args) {
        String input = "20 5 /"; 
        double result = evaluateRPN(input);
        System.out.println("Résultat : " + result);
    }

    private static double evaluateRPN(String input) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = input.split("\\s+"); // Divise l'entrée en tokens

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { // Si le token est un nombre
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

    private static double performOperation(double operand1, double operand2, String operator) {
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
