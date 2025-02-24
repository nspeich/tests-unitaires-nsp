// package calculator;
// import static junit.Assert.*;
// //import static org.junit.Assert.assertEquals;
// import org.junit.Test;


// public class CalculatorTest {

//     @Test
//     public void testAddition() {
//         String input = "3 7 +";
//         double result = Calculator.evaluateRPN(input);
//         assertEquals(10.0, result, 0.001);
//     }

//     @Test
//     public void testSubtraction() {
//         String input = "10 4 -";
//         double result = Calculator.evaluateRPN(input);
//         assertEquals(6.0, result, 0.001);
//     }

//     @Test
//     public void testMultiplication() {
//         String input = "2 3 *";
//         double result = Calculator.evaluateRPN(input);
//         assertEquals(6.0, result, 0.001);
//     }

//     @Test(expected = IllegalArgumentException.class)
//     public void testUnknownOperator() {
//         String input = "3 4 ^";
//         Calculator.evaluateRPN(input);
//     }
// }




import org.junit.jupiter.api.*;

import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        String input = "3 7 +";
        double result = Calculator.evaluateRPN(input);
        assertEquals(10.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        String input = "10 4 -";
        double result = Calculator.evaluateRPN(input);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        String input = "2 3 *";
        double result = Calculator.evaluateRPN(input);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testUnknownOperator() {
        String input = "3 4 ^";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.evaluateRPN(input);
        });
        assertEquals("Opérateur inconnu : ^", exception.getMessage());
    }
}

